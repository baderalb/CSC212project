import java.util.*;

public class Phonebook 
{
    
    LinkedList list;//to store the contacts
    Event events;//to store the events as linked_list
    Contact contacts;
    
    Phonebook()
    {
        list = new LinkedList();
        events = null;
    }
    
    //add new contact to the list
    public boolean add(Contact c)
    {
        //check if we added this contact before or not
        if(list.check(c.name, c.phone))
            return false;
        else
        {   
            list.add(c);
            return true;
        }
    }
    
    //search for contact by name
    public Contact SearchByName(String name)
    {
        return list.SearchByName(name);
    }
    
    //search for contact by phone
    public Contact SearchByPhone(String phone)
    {
        return list.SearchByPhone(phone);
    }
    
    
    //search for contacts by email
    public Contact SearchByEmail(String email)
    {
        return list.SearchByEmail(email);
    }
    
    //search for contacts by address
    public Contact SearchByAddress(String address)
    {
        return list.SearchByAddress(address);
    }
    
    //search for contacts by birth date
    public Contact SearchByBirth(Date birth)
    {
        return list.SearchByBirth(birth);
    }
    
    //search for contacts by first name
    public Contact[] SearchByFirstName(String name)
    {
        return list.SearchByFirstName(name);
    }
    
    //Schedule a new event
    public boolean Schedule(String title , String name , Date date , String location )
    {
        //search for the contact based on name
        Contact c = list.SearchByName(name);
        if( c != null ) {
            Event event = new Event(title, date , location,c);
            //check if we add first event
            if(events==null) {
                events  = event;
                return true;}
            //check if we have conflict in same date and time
            if(CheckConflict(event)) {
                System.out.println("Conflict in date and time.!");
                return false;}
            //add the event in alphapitical order
            Event temp= events , prev=events;
            while(temp != null){
                if(temp.title.compareTo(event.title) > 0){
                    if (temp == events) {
                        event.next = events;
                        events = event;
                    } else {
                        prev.next = event;
                        event.next = temp; }
                    return true;
                }
                prev=temp;
                temp=temp.next;
            }
            prev.next = event;
            return true;
        }
        else{
            System.out.println("No such contact!");
            return false; } 
    }
    
    //search for events based on contact name
    public Event SearchEventByName(String name)
    {
    	
       
        Event temp = events;
        while(temp != null)
        {
          
            if(temp.c.name.equals(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    
    //search for events based on title
    public Event SearchEventByTitle(String title)
    {
        //to each event in the list
        Event temp = events;
        while(temp != null)
        {
            //if title equals then return the event
            if(temp.title.equals(title))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    
    //print all events in the list in alphapitical order
    public void PrintAllEvent()
    {
        Event temp = events;
        while (temp != null) {
            System.out.println(temp + "\n");
            temp = temp.next;
        }
    }
    
    //Delete a contact and all events related with it
    public boolean Delete(String name)
    {
        //if contact delete
        if(list.delete(name))
        {
            //search for all events related with and delete them 
            Event temp = events , prev = null;
            while(temp != null)
            {
                if(temp.c.name.equals(name))
                {
                    if(temp == events)
                    {
                        events= events.next;
                        temp = events;
                        continue;
                    }
                    else
                    {
                        prev.next = temp.next;
                        temp = temp.next;
                        continue;
                    }
                }
                prev= temp;
                temp = temp.next;
            }
            return true;
        }
        return false;
    }

    //check if we have conflict for this contact with his events before
    private boolean CheckConflict(Event event) {
        //to each event in the list
        Event temp = events;
        while(temp != null)
        {
            //if same contact and same event date&time then return true this is conflict!
            if(temp.c.name.equals(event.c.name) && temp.date.compareTo(event.date) == 0)
                return true;
            temp = temp.next;
        }
        return false;//no conflict
    }
}
