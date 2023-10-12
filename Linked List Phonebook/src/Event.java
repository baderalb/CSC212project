
public class Event {
	private String EventTitle;
	private String EventDate;
	private String EventTime;
	private String EventLocation;
	private String ContactName;//requirement
	private Contact ContactInvolvedInthisEvent;//requirement
	
	public LinkedList<Event> EventInEvent= new LinkedList<Event>() ;
	public LinkedList<Contact> ContactsWithEvent = new LinkedList<Contact>();//requirement
	

	public Event(String EventTitle, String EventDate ,String EventTime, String EventLocation , String ContactName) {
		
		this.EventTitle=EventTitle;
		this.EventDate=EventDate;
		this.EventTime=EventTime;
		this.EventLocation=EventLocation;
		this.ContactName=ContactName;
		
		
	}


	public String getEventTitle() {
		return EventTitle;
	}


	public void setEventTitle(String eventTitle) {
		EventTitle = eventTitle;
	}


	public String getEventDate() {
		return EventDate;
	}


	public void setEventDate(String eventDate) {
		EventDate = eventDate;
	}


	public String getEventTime() {
		return EventTime;
	}


	public void setEventTime(String eventTime) {
		EventTime = eventTime;
	}


	public String getEventLocation() {
		return EventLocation;
	}


	public void setEventLocation(String eventLocation) {
		EventLocation = eventLocation;
	}


	public String getContactName() {
		return ContactName;
	}


	public void setContactName(String contactName) {
		ContactName = contactName;
	}


	public Contact getContactInvolvedInthisEvent() {
		return ContactInvolvedInthisEvent;
	}


	public void setContactInvolvedInthisEvent(Contact contactInvolvedInthisEvent) {
		ContactInvolvedInthisEvent = contactInvolvedInthisEvent;
	}
	@Override
	public String toString() {
		return "Event [EventTitle=" + EventTitle + ", EventDate=" + EventDate + ", EventTime=" + EventTime
				+ ", EventLocation=" + EventLocation + ", ContactName=" + ContactName + "]";
	}
	
	
	
}

