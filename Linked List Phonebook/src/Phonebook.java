import java.util.*;
public class Phonebook {
	static LinkedList<Contact> contacts;
	public Phonebook() {
	   contacts=new LinkedList<Contact>();
	}
	public Phonebook(LinkedList<Contact> contacts) {
		this.contacts = contacts;
	}
	public void Add_Stored_user(Contact d) {
		if(contacts.isempty()) {
			contacts.insert(d);
			return;
		}
		else {
			contacts.findfirst ();
			if(d.compareTo(contacts.retrieve().getContactname())<0) {
				Contact c= new Contact(contacts.retrieve());
				contacts.update(d);
				contacts.insert(c);
				return;
			}else {
				while(!contacts.last()&&(contacts.retrieve().compareTo(d.getContactname())<=0)){
					contacts.findnext();
				}
				if(contacts.retrieve().compareTo(d.getContactname())>0) {
					Contact c= new Contact(contacts.retrieve());
					contacts.update(d);
					contacts.insert(c);
				}
				else {
					d.displaycontact();
					contacts.insert(d);
					
				}
			}
		}
	}
	public boolean search(Contact c) {
		if(contacts.isempty())
			return false;
		contacts.findfirst();
		while(!contacts.last()) {
			if(contacts.retrieve().getContactname().equals(c.getContactname())||contacts.retrieve().getPhonenumber().equals(c.getPhonenumber()))
				return true;
			contacts.findnext();
			}
		if(contacts.retrieve().getContactname().equals(c.getContactname())||contacts.retrieve().getPhonenumber().equals(c.getPhonenumber()))
				return true;
		else
			return false;
	}
	public void add_contact(Contact c) {
		boolean found=search(c);
		if(!found) {
			Contact.AddSorted1(c);
			System.out.println("Contact added successfully");
		}else {
				System.out.println("Adding Failed");
		}
	}
	public void deletecontact(String s) {
		if(contacts.isempty()) {
			System.out.println("Empty List can not be deleted");
			return;
		}
		contacts.findfirst();
		while(!contacts.last()) {
		if(contacts.retrieve().getContactname().equals(s)) {
			contacts.remove();
			System.out.println(s+"Contact deleted");
			return;
		}
		contacts.findnext();
		}
		if(contacts.retrieve().getContactname().equals(s)) {
			contacts.remove();
			System.out.println(s+"contact deleted");
		}
		else
			System.out.println("can not be deleted it is not exist");
	}
			
		}
		}
	

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}