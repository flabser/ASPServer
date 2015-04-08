package handler.testservices

import java.rmi.RemoteException;
import java.util.Map;
import kz.lof.webservices.tax.*
import kz.lof.webservices.tax.store.*
import kz.lof.webservices.Utils
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData;
import kz.nextbase.script.events._DoHandler


class Trigger extends _DoHandler {

	@Override
	public void doHandler(_Session session, Map<String, String[]> formData,	String lang) {
		def answerserver = Utils.testService (formData.get("typeservice")[0],formData.get("nameservice")[0])
		println("Start");
		try {
			//def result = proxy.getDataByRNN(formData.get("rnn")[0]);
		
				//msgBox ( fullData.getTaxingOffice().getName(),"name");
				//msgBox ( fullData.getBusinessName(),"name");
				//msgBox (  fullData.getAddress().getStreet() + " " + fullData.getAddress().getHouse() + " "+fullData.getAddress().getPlace(),"address");
				msgBox (answerserver.toString(),"answer");
			
		} catch (RemoteException re) {
			println("������� ����");
		}
	}

	@Override
	public void doHandler(_Session session, _WebFormData formData) {
		// TODO Auto-generated method stub
		
	}

}
