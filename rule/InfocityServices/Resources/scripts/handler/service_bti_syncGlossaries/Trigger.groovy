package handler.service_bti_syncGlossaries

import kz.flabs.runtimeobj.document.glossary.Glossary
import kz.flabs.users.User
import kz.lof.webservices.clients.bti.BTIServiceProxy
import kz.lof.webservices.store.bti.BuildingKind
import kz.lof.webservices.store.bti.DocKind
import kz.lof.webservices.store.bti.DocType
import kz.lof.webservices.store.bti.RealtySearchResult
import kz.nextbase.script._Database
import kz.nextbase.script._Glossary
import kz.nextbase.script._Session
import kz.nextbase.script.events._DoScheduledHandler

class Trigger extends _DoScheduledHandler {

    /**
     * предварительно в system_database завести пользователя temp_user с доступом в InfocityServices
     * и методам  getDocKinds getDocTypes buildingKinds сервиса БТИ
     */

    @Override
    int doHandler(_Session session) {
            def db = (_Database) session.getCurrentDatabase();
        User bti_user = new User("temp_user", db.baseObject);
        BTIServiceProxy btiServiceProxy = new BTIServiceProxy(bti_user);
        //BTIServiceProxy btiServiceProxy = new BTIServiceProxy(session.getUser());

        /*-- update DocKind --*/

        DocKind[] docKinds = btiServiceProxy.getDocKinds("rus");
        session.user.getSession().pageSize = 30;
        int pageCount = (int)Math.ceil((float)db.getGlossaryDocsCount("form = 'dokpriznak'")/30.0)
        if(pageCount == 0) pageCount = 1;
        for (int i = 1; i <= pageCount; i++) {
            def gloss_part = db.getGlossaryDocs("form = 'dokpriznak'", i);
            gloss_part.each { glossDocPriznak ->
                def docKind = docKinds.find{d -> d.getId() == glossDocPriznak.getValueString("code").toInteger()}
                if (docKind) {
                    glossDocPriznak.setValueString("name", docKind.name)
                    glossDocPriznak.setViewText(docKind.name)
                    glossDocPriznak.addViewText(docKind.name)
                    glossDocPriznak.setValueString("code", docKind.id.toString())
                    glossDocPriznak.addViewText(docKind.id.toString())
                    glossDocPriznak.setValueString("is_actual", "true")
                    glossDocPriznak.save("[supervisor]");
                    docKinds = docKinds - docKind;
                } else {
                    glossDocPriznak.setValueString("is_actual", "false")
                    glossDocPriznak.save("[supervisor]");
                }
            }
        }

        docKinds.each {
            def docPriznak = new _Glossary(new Glossary(session.currentDatabase.baseObject), session);
            docPriznak.setForm("dokpriznak");
            docPriznak.setValueString("form", "dokpriznak");
            docPriznak.setValueString("name", it.name)
            docPriznak.setViewText(it.name)
            docPriznak.addViewText(it.name)
            docPriznak.setValueString("code", it.id.toString())
            docPriznak.addViewText(it.id.toString())
            docPriznak.setValueString("is_actual", "true")
            docPriznak.save("[supervisor]");
        }

        /*-- update DocType --*/

        DocType[] docTypes = btiServiceProxy.getDocTypes("rus");
        pageCount = (int)Math.ceil((float)db.getGlossaryDocsCount("form = 'typedoc'")/30.0)
        if(pageCount == 0) pageCount = 1;
        for (int i = 1; i <= pageCount; i++) {
            def gloss_part = db.getGlossaryDocs("form = 'typedoc'", i);
            gloss_part.each { glossDocType ->
                def docType = docTypes.find{d -> d.getId() == glossDocType.getValueString("code").toInteger()}
                if (docType) {
                    glossDocType.setValueString("name", docType.name)
                    glossDocType.setViewText(docType.name)
                    glossDocType.addViewText(docType.name)
                    glossDocType.setValueString("code", docType.id.toString())
                    glossDocType.addViewText(docType.id.toString())
                    glossDocType.setValueString("is_actual", "true")
                    glossDocType.save("[supervisor]");
                    docTypes = docTypes - docType;
                } else {
                    glossDocType.setValueString("is_actual", "false")
                    glossDocType.save("[supervisor]");
                }
            }
        }

        docTypes.each {
            def glossDocType = new _Glossary(new Glossary(session.currentDatabase.baseObject), session);
            glossDocType.setForm("typedoc");
            glossDocType.setValueString("form", "typedoc");
            glossDocType.setValueString("name", it.name)
            glossDocType.setViewText(it.name)
            glossDocType.addViewText(it.name)
            glossDocType.setValueString("code", it.id.toString())
            glossDocType.addViewText(it.id.toString())
            glossDocType.setValueString("is_actual", "true")
            glossDocType.save("[supervisor]");
        }

        /*-- update BuildingKind --*/

        BuildingKind[] buildingKinds = btiServiceProxy.getBuildingKinds("rus");
        pageCount = (int)Math.ceil((float)db.getGlossaryDocsCount("form = 'priznakstroyeniya'")/30.0)
        if(pageCount == 0) pageCount = 1;
        for (int i = 1; i <= pageCount; i++) {
            def gloss_part = db.getGlossaryDocs("form = 'priznakstroyeniya'", i);
            gloss_part.each { glossBuildingKind ->
                def buildingKind = buildingKinds.find{b -> b.getId() == glossBuildingKind.getValueString("code").toInteger()}
                if (buildingKind) {
                    glossBuildingKind.setValueString("name", buildingKind.name)
                    glossBuildingKind.setViewText(buildingKind.name)
                    glossBuildingKind.addViewText(buildingKind.name)
                    glossBuildingKind.setValueString("code", buildingKind.id.toString())
                    glossBuildingKind.addViewText(buildingKind.id.toString())
                    glossBuildingKind.setValueString("is_actual", "true")
                    glossBuildingKind.save("[supervisor]");
                    buildingKinds = buildingKinds - buildingKind;
                } else {
                    glossBuildingKind.setValueString("is_actual", "false")
                    glossBuildingKind.save("[supervisor]");
                }
            }
        }

        buildingKinds.each {
            def glossBuildingKind = new _Glossary(new Glossary(session.currentDatabase.baseObject), session);
            glossBuildingKind.setForm("priznakstroyeniya");
            glossBuildingKind.setValueString("form", "priznakstroyeniya");
            glossBuildingKind.setValueString("name", it.name)
            glossBuildingKind.setViewText(it.name)
            glossBuildingKind.addViewText(it.name)
            glossBuildingKind.setValueString("code", it.id.toString())
            glossBuildingKind.addViewText(it.id.toString())
            glossBuildingKind.setValueString("is_actual", "true")
            glossBuildingKind.save("[supervisor]");
        }

        return 0;
    }
}
