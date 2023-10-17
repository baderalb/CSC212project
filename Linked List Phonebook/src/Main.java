import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Phonebook book = new Phonebook();
		System.out.println("Welcome to the Linked Tree Phonebook!\n");
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Please choose an option:\n" + "1. Add a contact\n" + "2. Search for a contact\n"
					+ "3. Delete a contact\n" + "4. Schedule an event\n" + "5. Print event details\n"
					+ "6. Print contacts by first name\n" + "7. Print all events alphabetically\n" + "8. Exit\n" + "\n"
					+ "Enter your choice:");
			String ch = s.nextLine();
			switch (ch) {
			case "1": {
				System.out.print("Enter the contact's name: ");
				String name = s.nextLine();
				System.out.print("Enter the contact's phone number: ");
				String phone = s.nextLine();
				System.out.print("Enter the contact's email address: ");
				String email = s.nextLine();
				System.out.print("Enter the contact's address: ");
				String address = s.nextLine();
				System.out.print("Enter the contact's birthday: ");
				String date = s.nextLine();
				System.out.print("Enter any notes for the contact: ");
				String note = s.nextLine();
				System.out.println("");
				if (book.add(new Contact(name, phone, email, address, new Date(date), note))) {
					System.out.println("Contact added successfully!");
				} else {
					System.out.println("Contact with same name or phone already exist in the system.");
				}
			}
				break;

			// ===============================================================
			case "2": {
				System.out.println("\nEnter search criteria:\n" + "1. Name\n" + "2. Phone Number\n"
						+ "3. Email Address\n" + "4. Address\n" + "5. Birthday\n");
				ch = s.nextLine();
				switch (ch) {
				case "1": {
					System.out.print("Enter the contact's name: ");
					String name = s.nextLine();
					Contact c = book.SearchByName(name);
					if (c != null) {
						System.out.println("Contact found!");
						System.out.println(c);
					} else {
						System.out.println("No such contact");
					}
				}
					break;

				case "2": {
					System.out.print("Enter the contact's phone number: ");
					String phone = s.nextLine();
					Contact c = book.SearchByPhone(phone);
					if (c != null) {
						System.out.println("Contact found!");
						System.out.println(c);
					} else {
						System.out.println("No such contact");
					}
				}
					break;

				case "3": {
					System.out.print("Enter the contact's email address: ");
					String email = s.nextLine();
					Contact c = book.SearchByEmail(email);
					if (c != null) {
						System.out.println("Contacts found!\n");
						System.out.println(c);
					}

					else {
						System.out.println("No such contact");
					}
				}
					break;

				case "4": {
					System.out.print("Enter the contact's address: ");
					String address = s.nextLine();
					Contact c = book.SearchByAddress(address);
					if (c != null) {
						System.out.println("Contacts found!\n");
						System.out.println(c);
					}

					else {
						System.out.println("No such contact");
					}

				}
					break;

				case "5": {
					System.out.print("Enter the contact's birthday: ");
					String date = s.nextLine();
					Contact c = book.SearchByBirth(new Date(date));
					if (c != null) {
						System.out.println("Contacts found!\n");
						System.out.println(c);
					}

					else {
						System.out.println("No such contact");
					}

				}
					break;
				}

			}
				break;

			// ===============================================================

			case "3": {
				System.out.print("Enter the contact's name: ");
				String name = s.nextLine();
				if (book.Delete(name)) {
					System.out.println("Contact deleted!\n");

				} else {
					System.out.println("No such contact.\n");
				}
			}
				break;

			// ===============================================================
			case "4": {
				System.out.print("Enter event title: ");
				String title = s.nextLine();
				System.out.print("Enter contact name: ");
				String name = s.nextLine();
				System.out.print("Enter event date and time (MM/DD/YYYY HH:MM): ");
				String date = s.nextLine();
				System.out.print("Enter event location: ");
				String location = s.nextLine();
				if (book.Schedule(title, name, new Date(date), location)) {
					System.out.println("Event scheduled successfully!");
				}
			}
				break;

			// ===============================================================
			case "5": {
				System.out.println("Enter search criteria:\n" + "1. contact name\n" + "2. Event tittle");

				ch = s.nextLine();
				switch (ch) {
				case "1": {
					System.out.print("Enter the contact name: ");
					String name = s.nextLine();
					Event events = book.SearchEventByName(name);
					if (events != null) {
						System.out.println("Events found!");
						System.out.println(events);
					} else {
						System.out.println("No such event");

					}
				}
					break;

				case "2": {
					System.out.print("Enter the event title: ");
					String title = s.nextLine();
					Event t = book.SearchEventByTitle(title);
					if (t != null) {
						System.out.println("Event found!");
						System.out.println(t);
					} else {
						System.out.println("No such event");
					}
				}
					break;
				}
			}
				break;

			// ===============================================================
			case "6": {
				System.out.print("Enter the first name: ");
				String name = s.nextLine();
				Contact[] c = book.SearchByFirstName(name);
				if (c[0] != null) {
					System.out.println("Contacts found!");
					for (Contact cc : c) {
						if (cc != null) {
							System.out.println(cc);
							System.out.println("\n");
						}
					}
				} else {
					System.out.println("No such contact");
				}
			}
				break;

			// ===============================================================
			case "7": {
				book.PrintAllEvent();
			}
				break;

			// ===============================================================
			case "8": {
				System.out.println("Goodbye!");
				return;
			}

			// ===============================================================
			}
			System.out.println("\n");

		}
	}

}
