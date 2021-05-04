package abstract›nterfaceStarbucksNeroDay4Homework2;

import java.rmi.RemoteException;

public class StarbucksService extends Service {
		CustomerCheckService customerCheckService;
		
		public StarbucksService(CustomerCheckService customerCheckService) {
		
			this.customerCheckService = customerCheckService;
		}	
		
		
		
	@Override
	public void save(Customer customer) throws RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: "+customer.firstName);

		}
		else {
			System.out.println("Can't Saved to db: "+customer.firstName);

		}
	}



		

}
