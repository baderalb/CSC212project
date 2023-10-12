import java.util.Scanner;

public class Contact implements Comparable<String> {
	private String contactname;
	private String phonenumber;
	private String emailaddress;
	private String address;
	private String birthday;
	private String notes;
	private String relationship;
	private String nickname;
	private Event  EventInContact;
	public LinkedList <Event> ContactEvent = new LinkedList<Event>();
	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	

	public Event getEventInContact() {
		return EventInContact;
	}

	public void setEventInContact(Event eventInContact) {
		EventInContact = eventInContact;
	}

	public LinkedList<Event> getContactEvent() {
		return ContactEvent;
	}

	public void setContactEvent(LinkedList<Event> contactEvent) {
		ContactEvent = contactEvent;
	}

	public Contact() {

	}

	public Contact(String contactname, String phonenumber, String emailaddress, String address, String birthday,
			String relationship, String nickname, String notes) {
		this.contactname = contactname;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
		this.nickname = nickname;
	}

	public Contact(Contact x) {
		this.contactname = x.contactname;
		this.phonenumber = x.phonenumber;
		this.emailaddress = x.emailaddress;
		this.address = x.address;
		this.birthday = x.birthday;
		this.notes = x.notes;
		this.nickname = x.nickname;
		this.relationship = x.relationship;

	}

	public int compareTo(String x) {
		return contactname.compareTo(x);
	}

	public int compareTo(Contact p) {
		return contactname.compareTo(p.contactname);
	}
	public void readfromcontact() {
		Scanner input = new Scanner(System.in);
		System.out.println(" please enter the contact name:");
		contactname = input.nextLine();
		System.out.println(" please enter the contact number:");
		phonenumber = input.nextLine();
		System.out.println(" please enter the contact email address:");
		emailaddress = input.nextLine();
		System.out.println(" please enter the contact address:");
		address = input.nextLine();
		System.out.println(" please enter the contact birthday:");
		birthday = input.nextLine();
		System.out.println("please enter the note for the contact:");
		notes = input.nextLine();
		System.out.println("please enter the contact relationship:");
		relationship = input.nextLine();
		System.out.println("please enter the contact nickname:");
		nickname = input.nextLine();

	}

	public void displaycontact() {
		System.out.println("Name:" + contactname);
		System.out.println("Phone Number" + phonenumber);//new
		System.out.println("Email" + emailaddress);//new
		System.out.println("Addres" + address);//new
		System.out.println("Birthday" + birthday);//new
		System.out.println("Notes" + notes);//new
		System.out.println("Relation ship" + relationship);//new
		System.out.println("Nick name" + nickname);//new
}
}