package addressbook;

import java.util.Scanner;

public class AddressBookManagerImp {
	
	public void displayAddressBook() {
	}
	public void newAddressBook() {
		int loop=0;
		while (loop == 0) {
			AddressBookImplementation Menu = new AddressBookImplementation();
			System.out.println("Address Book"
							+ "\n1. add Person"
							+ "\n2. edit Person"
							+ "\n3. delete Person"
							+ "\n4. sort ByName"
							+ "\n5. sort ByZip"
							+ "\n6. search Person"
							+ "\n7. Quit"
							+ "\n8. display"
							+ "\n. select any choice ");
			
			Scanner input = new Scanner(System.in); 

			int num = input.nextInt();
			switch (num) {
			case 1:
				Menu.addPerson();
				break;
			case 2:
				Menu.editPerson();
				break;
			case 3:
				Menu.deletePerson();
				break;
			case 4:
				Menu.sortByName();
				break;
			case 5:
				Menu.sortByZip();
				break;
			case 6:
				Menu.searchPerson();
				break;
			case 7:
				Menu.quit();
				break;
			case 8:
				Menu.display();
				
				break;
			default:
				System.out.println("please enter right choice");
			}
		
	}
	}
	
	
	private void display() {
		// TODO Auto-generated method stub
		
	}
	private void searchPerson() {
		// TODO Auto-generated method stub
		
	}
	private void sortByZip() {
		// TODO Auto-generated method stub
		
	}
	private void sortByName() {
		// TODO Auto-generated method stub
		
	}
	private void deletePerson() {
		// TODO Auto-generated method stub
		
	}
	private void editPerson() {
		// TODO Auto-generated method stub
		
	}
	private void addPerson() {
		// TODO Auto-generated method stub
		
	}
	public void saveAddressBook() {
		
	}
	public void saveasAddressBook() {
		
	}
	public void closeAddressBook() {
		
	}
	public void quit() {
		
	}
	public void openAddressBook() {
		// TODO Auto-generated method stub
		
	}
	
		
	
	}

	
