package AddressBook;
import java.util.*;

public class AddressBook {
	public static <T> Collection<? extends String> contact() {
		ArrayList<T> contacts = new ArrayList<T>();
		Scanner fname = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME: ");
		String firstName = fname.nextLine();
		contacts.add((T) firstName);
		Scanner lname = new Scanner(System.in);
		System.out.println("ENTER THE LAST NAME: ");
		String lastName = fname.nextLine();
		contacts.add((T) lastName);
		Scanner add = new Scanner(System.in);
		System.out.println("ENTER THE ADDRESS: ");
		String address = add.nextLine();
		contacts.add((T) address);
		Scanner City = new Scanner(System.in);
		System.out.println("ENTER THE CITY: ");
		String city = City.nextLine();
		contacts.add((T) city);
		Scanner State = new Scanner(System.in);
		System.out.println("ENTER THE STATE: ");
		String state = State.nextLine();
		contacts.add((T) state);
		Scanner Email = new Scanner(System.in);
		System.out.println("ENTER THE EMAIL: ");
		String email = Email.nextLine();
		contacts.add((T) email);
		Scanner zipcode = new Scanner(System.in);
		System.out.println("ENTER THE ZIPCODE: ");
		String zip = zipcode.nextLine();
		contacts.add((T) zip);
		Scanner cell = new Scanner(System.in);
		System.out.println("ENTER THE PHONE NUMBER: ");
		String phoneNumber = cell.nextLine();
		contacts.add((T) phoneNumber);
		System.out.println("FIRST NAME: " + firstName);
		System.out.println("LAST NAME: " + lastName);
		System.out.println("ADRESS: " + address);
		System.out.println("CITY: " + city);
		System.out.println("STATE: " + state);
		System.out.println("EMAIL: " + email);
		System.out.println("ZIPCODE: " + zip);
		System.out.println("PHONE NUMBER: " + phoneNumber);
		return (Collection<? extends String>) contacts;
		
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO ADDRESS BOOK");
		
		Scanner option = new Scanner(System.in);
		System.out.println("IF U NEED TO ADD CONTACT PRESS YES OR NO");
		String Option = option.nextLine();
		ArrayList<String> contacts = new ArrayList<String>();
		if (Option == "NO") {
			System.out.println("THANK YOU FOR YOUR SUGGESTION");
			contact();
			contacts.addAll(contact());
		} else {
			contact();
			contacts.addAll(contact());
			
		}

	}
}
