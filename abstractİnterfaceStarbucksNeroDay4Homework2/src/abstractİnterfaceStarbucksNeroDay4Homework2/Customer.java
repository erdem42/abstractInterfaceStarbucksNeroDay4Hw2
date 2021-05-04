package abstract›nterfaceStarbucksNeroDay4Homework2;


import java.time.LocalDate;


public class Customer {
	int id;
	String firstName;
	String lastName;
	String nationalityId;

	
	LocalDate dateOfBirth;
	int year;
	//int month = dateOfBirth.getMonthValue();
	//int day   = dateOfBirth.getDayOfMonth();
	
	public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.year=dateOfBirth.getYear();
}
}
