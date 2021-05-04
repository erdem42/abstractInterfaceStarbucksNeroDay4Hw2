package abstract›nterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;

public abstract class Service {
	
	void save(Customer customer) throws RemoteException {
		System.out.println("saved to db:"+ customer.firstName);
	}
}
