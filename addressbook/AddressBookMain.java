package addressbook;

import java.util.Scanner;

	public class AddressBookMain {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in); 
			AddressBookManagerImp addressbookmanager = new AddressBookManagerImp();
			int loop=0;
			while (loop == 0) {
				
				System.out.println("\n *** Address Book ***"
						+ "\n1. Create newAddressBook"
						+ "\n2. Open existing AddressBook"
						+ "\n3. Save Address Book"
						+ "\n4. Save as AddressBook"
						+ "\n5. Close AddressBook"
						+ "\n6. Quit"
						+ "\n  select any choice ==> ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					addressbookmanager.newAddressBook();
					break;
				case 2:
					addressbookmanager.openAddressBook();
					break;
				case 3:
					addressbookmanager.saveAddressBook();
					break;
				case 4:
					addressbookmanager.saveasAddressBook();
					break;
				case 5:
					addressbookmanager.closeAddressBook();
					break;
				case 6:
					addressbookmanager.quit();
					break;
				
				default:
					System.out.println("please enter right choice");
				}
			}
		}

	
}