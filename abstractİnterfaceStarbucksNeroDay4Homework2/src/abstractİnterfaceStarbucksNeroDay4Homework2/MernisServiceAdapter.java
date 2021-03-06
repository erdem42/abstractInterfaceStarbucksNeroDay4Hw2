package abstractİnterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer)throws RemoteException  {
	
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
							customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.year);

		System.out.println("Doğrulama:" + (result ? "Başarılı" : "Başarısız"));
		if(result)
			return true;
		else {
			return false;
		}
	}

}
