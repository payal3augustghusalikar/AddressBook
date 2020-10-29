package addressbook;
import java.util.*;

class AddressBookImplementation implements AddressBookInterface {
	Person p;
	private Object name;
	private Scanner inp;
	public static ArrayList<Person> addressBook = new ArrayList<Person>();
	// addressBook = new ArrayList<Person>();
    
	public AddressBookImplementation() {
		 ArrayList<Person> addressBook = new ArrayList<Person>();	 
	}
	public void addPerson() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter your first name:");
	     String firstName = scanner.nextLine();
	     System.out.println("enter your last name:");
	     String lastName = scanner.nextLine();
	     System.out.println("enter your city");
	     String city = scanner.nextLine();
	     System.out.println("enter your state");
	     String state = scanner.nextLine();
	     System.out.println("enter your phone");
	     long MobileNo = scanner.nextLong();
	     System.out.println("enter your zip code");
	     int zip = scanner.nextInt();

	     Person person = new Person(firstName, lastName, city, state, MobileNo, zip);
	     addressBook.add(person);
	   //  System.out.println(addressBook);
	}
	
	public void editPerson() {
		inp = new Scanner(System.in);
		
		System.out.println("\n enter First name to edit details:");
		
		String name = inp.nextLine();

		//boolean isfound = false;
		for (Person person : addressBook) {
			System.out.println(person.toString());
		
			if (name.equals(person.firstName)) {
				//isfound = true;
				System.out.println("\"Select the option to edit: \n"
							+ "1) Mobile no\n"
							+ "2) Address\n"
							+ "3) Quit");
				int numb = inp.nextInt();
				inp = new Scanner(System.in);
				switch (numb) {
				 	case 1:
				 		System.out.println("enter new value:");
				 		long MobileNo = inp.nextLong();
				 		person.setMobileNo(MobileNo);
				 		System.out.println("mobile no. is updated\n");
				 		break;
				 	case 2:
				 		System.out.println("enter your city");
				 		String city = inp.nextLine();
				 		System.out.println("enter your state");
				 		String state = inp.nextLine();
				 		System.out.println("enter your zip code");
				 		int zip = inp.nextInt();
				 		person.setCity(city);
				 		person.setState(state);
				 		person.setZip(zip);
				 		System.out.println("(person.firstname) Address is updated\n");
						break;
					default:
						System.out.println("please enter right choice");
						break;
				}
			}
			else 
				System.out.println("Person is not registered");
			break;
	   }	 
	}
	
	
	public void deletePerson() {
		inp = new Scanner(System.in);
		
		System.out.println("enter First name to delit details:");
		
		String name = inp.nextLine();
		for (int i=0; i<addressBook.size(); i++) {
			String personName = addressBook.get(i).firstName;
	
			if (name.equals(personName)) {
				
				addressBook.remove(i);
				System.out.println("this person details is deleted");
			
			break;
			}
			else 
				System.out.println("please enter valid name");
			break;
		}
			
    }	
	
	public void sortByName() {
		Collections.sort(addressBook, new NameComparator());
		System.out.println("sorted by name");
		for (Person person : addressBook)
			System.out.println(person.toString());
		
	}

	public void sortByZip() {
		
		
	}

	public void searchPerson() {
		inp = new Scanner(System.in);
		
		System.out.println("enter mobile no. to search person:");
		
		long number = inp.nextLong();
		boolean isfound = false;
		for (Person person : addressBook) {
			
			if (number == person.MobileNo) {
				
				System.out.println(person.toString());
			
			}
			else {
				System.out.println("please check entered mobile number:");
			
			}
		}
	}

	public void display() {
		System.out.println("\nEntered Person Details is:");
			for(Person p : addressBook) {
				System.out.println(p.toString());
			
			}
	
	}
	public void quit() {
inp = new Scanner(System.in);
		
		System.out.println("enter First name to search person:");
		
		String name = inp.nextLine();
	
		Person p;
		boolean isfound = false;
		for (Person person : addressBook) {
			System.out.println(person.toString());
		
			if (name.equals(person.MobileNo)) {
				System.out.println(person.toString());
			}
			else {
				System.out.println("please check entered name:");
			}
			}
		
	}
	
}
