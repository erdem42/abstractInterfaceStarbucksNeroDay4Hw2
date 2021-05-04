package abstract›nterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

// TEST AMA«LI BU ADAPTER KULLANILAB›L›R.

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
