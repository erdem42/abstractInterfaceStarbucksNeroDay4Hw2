package abstract›nterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;
import java.time.LocalDate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {
	
	
	public static void main(String[] args) throws RemoteException  {
		
		Customer customer=new Customer(1,"Erdem","erdem","11111111111",LocalDate.of(2000,8,1));

		
		Service service=new StarbucksService(new MernisServiceAdapter());
		service.save(customer);
	
	}
	
}
