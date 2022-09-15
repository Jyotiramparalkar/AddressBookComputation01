/**
 * 
 */
/**
 * @author shivraj
 *
 */
package com.bridgelabz;

import java.util.Scanner;

public class AddressBook
{
	
	String firstName;
	String lastName;
	String address;
	String cityName;
	String state;
	String zip;
	int phoneNumber;
	String emailId;
	
	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			int phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}


    public void showDetails()
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(cityName);
		System.out.println(state);
		System.out.println(zip);
		System.out.println(phoneNumber);
		System.out.println(emailId);
	}
	
	public static void main(String[] args)
	{
		// Master AddressBook Main
		System.out.println("Welocme to AddressBook program");
		//Main method of Adding all the details AddressBook Computation
		String firstName1,lastName1, address1, cityName1, state1, zip1, emailId1;
		int phoneNo1;
		System.out.println("Enter the all the destails of customer ::");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the First Name::");
		firstName1 = in.nextLine();
		System.out.println("Enter the Last Name::");
		lastName1 = in.nextLine();
		System.out.println("Enter the address::");
		address1 = in.nextLine();
		System.out.println("Enter the City Name::");
		cityName1 = in.nextLine();
		System.out.println("Enter the State::");
		state1 = in.nextLine();
		System.out.println("Enter the Zip code::");
		zip1 = in.nextLine();
		System.out.println("Enter the Phone Number::");
		phoneNo1 = in.nextInt();
		System.out.println("Enter the Email ID::");
		emailId1 = in.nextLine();
		
		AddressBook addressBookObj = new AddressBook(firstName1, lastName1, address1, cityName1, state1, zip1, phoneNo1, emailId1);
		AddressBook addressBookObj1 = new AddressBook(firstName1, lastName1, address1, cityName1, state1, zip1, phoneNo1, emailId1);
		addressBookObj.showDetails();
		addressBookObj1.showDetails();
		in.close();
		
		
		
	}

}
