package abstractİnterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

// TEST AMAÇLI BU ADAPTER KULLANILABİLİR.

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
