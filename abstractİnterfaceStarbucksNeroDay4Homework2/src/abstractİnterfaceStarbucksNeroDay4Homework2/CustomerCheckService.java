package abstract›nterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;

public interface CustomerCheckService {
	
		
	boolean checkIfRealPerson(Customer customer)throws RemoteException;
		
		
	}