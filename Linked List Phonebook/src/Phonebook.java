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
	
	
	
	public LinkedList<Contact> SearchByEmail(String email) {
		LinkedList<Contact> list = new LinkedList<Contact> ();
		if(contacts.isempty()) {
			return list;
		}
			contacts.findfirst();
			while(!contacts.last()) {
				if(contacts.retrieve().getEmailadress().equalsIgnoreCase(email)) {
					list.insert(contacts.retrieve());
				}
					contacts.findnext();
				
			}
			if(contacts.retrieve().getEmailadress().equalsIgnoreCase(email)){
				list.insert(contacts.retrieve());
			}
			return list;
			}
	
	
	
	public LinkedList<Contact> SearchByBirthDay(String birth) {
		LinkedList<Contact> list = new LinkedList<Contact> ();
		if(contacts.isempty()) {
			return list;
		}
			contacts.findfirst();
			while(!contacts.last()) {
				if(contacts.retrieve().getBirthday().equalsIgnoreCase(birth)) {
					list.insert(contacts.retrieve());
				}
					contacts.findnext();
				
			}
			if(contacts.retrieve().getBirthday().equalsIgnoreCase(birth)){
				list.insert(contacts.retrieve());
			}
			return list;
			}
	
	
	
	public LinkedList<Contact> SearchByAddress(String address) {
		LinkedList<Contact> list = new LinkedList<Contact> ();
		if(contacts.isempty()) {
			return list;
		}
			contacts.findfirst();
			while(!contacts.last()) {
				if(contacts.retrieve().getAddress().equalsIgnoreCase(address)) {
					list.insert(contacts.retrieve());
				}
					contacts.findnext();
				
			}
			if(contacts.retrieve().getAddress().equalsIgnoreCase(address)){
				list.insert(contacts.retrieve());
			}
			return list;
			}
	
	
	
	public LinkedList<Contact> SearchByContactName(String Name) {
		LinkedList<Contact> list = new LinkedList<Contact> ();
		if(contacts.isempty()) {
			return list;
		}
			contacts.findfirst();
			while(!contacts.last()) {
				if(contacts.retrieve().getContactname().equalsIgnoreCase(Name)) {
					list.insert(contacts.retrieve());
				}
					contacts.findnext();
				
			}
			if(contacts.retrieve().getContactname().equalsIgnoreCase(Name)){
				list.insert(contacts.retrieve());
			}
			return list;
			}
	
	
	
	public LinkedList<Contact> SearchByPhoneNumber(String PhoneNumber) {
		LinkedList<Contact> list = new LinkedList<Contact> ();
		if(contacts.isempty()) {
			return list;
		}
			contacts.findfirst();
			while(!contacts.last()) {
				if(contacts.retrieve().getPhonenumber().equalsIgnoreCase(PhoneNumber)) {
					list.insert(contacts.retrieve());
				}
					contacts.findnext();
				
			}
			if(contacts.retrieve().getPhonenumber().equalsIgnoreCase(PhoneNumber)){
				list.insert(contacts.retrieve());
			}
			return list;
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