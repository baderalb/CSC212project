import java.util.*;
public class Phonebook {
	static LinkedList<Contact>();
	public PhoneBook() {
	   contacts=new LinkedList<Contact>();
	}
	public PhoneBook(LinkedList<Contact> contacts) {
		this.contacts = contacts;
	}
	public void Add_Stored_user(Contact d) {
		if(contacts.isEmpty()) {
			contacts.insert(d);
			return;
		}
		else {
			contacts.FindFirst();
			if(d.compareTo(contacts.retrieve().getcontact_name())<0) {
				Contact c= new Contact(contacts.retrive());
				contacts.update(d);
				contacts.insert(c);
				return;
			}else {
				while(!contacts.last()&&(contacts.retrieve().compareTo(d.getContact_name())<=0){
					contacts.findNext();
				}
				if(contacts.retrieve().compareTo(d.getContact_name())>0) {
					Contact c= new Contact(contacts.retrive());
					contacts.update(d);
					contacts.insert(c);
				}
				else {
					d.display_contact();
					contact.insert(d);
					
				}
			}
		}
	}
	public boolean search(Contact c) {
		if(contacts.isEmpty())
			return false;
		contacts.FindFirst();
		while(!contacts.last()) {
			if(contacts.retrieve().getContact_name().equals(c.getContact_name())||contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
				return true;
			contacts.findNext();
			}
		if(contacts.retrieve().getContact_name().equals(c.getContact_name())||contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
				return true;
		else
			return false;
	}
	public void add_contact(Contact c) {
		boolean found=search(c);
		if(!found) {
			contacts.Add_Sorted1();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}
