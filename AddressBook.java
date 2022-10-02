package AddressBook;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("WELCOME TO ADDRESS BOOK");
		Scanner fname = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME: ");
		String firstName = fname.nextLine();
		Scanner lname = new Scanner(System.in);
		System.out.println("ENTER THE LAST NAME: ");
		String lastName = fname.nextLine();
		Scanner add = new Scanner(System.in);
		System.out.println("ENTER THE ADDRESS: ");
		String address = add.nextLine();
		Scanner City = new Scanner(System.in);
		System.out.println("ENTER THE CITY: ");
		String city = City.nextLine();
		Scanner State = new Scanner(System.in);
		System.out.println("ENTER THE STATE: ");
		String state = State.nextLine();
		Scanner Email = new Scanner(System.in);
		System.out.println("ENTER THE EMAIL: ");
		String email = Email.nextLine();
		Scanner zipcode = new Scanner(System.in);
		System.out.println("ENTER THE ZIPCODE: ");
		int zip = zipcode.nextInt();
		Scanner cell = new Scanner(System.in);
		System.out.println("ENTER THE PHONE NUMBER: ");
		long phoneNumber = cell.nextLong();
		System.out.println("FIRST NAME: " + firstName);
		System.out.println("LAST NAME: " + lastName);
		System.out.println("ADRESS: " + address);
		System.out.println("CITY: " + city);
		System.out.println("STATE: " + state);
		System.out.println("EMAIL: " + email);
		System.out.println("ZIPCODE: " + zip);
		System.out.println("PHONE NUMBER: " + phoneNumber);
	}
}
