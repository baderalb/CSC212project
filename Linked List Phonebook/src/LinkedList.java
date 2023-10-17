
import java.util.Date;

public class LinkedList {
    //LinkedListADT all_contacts ;
    Contact head;
    
    LinkedList()
    {
        head=null;
    }
    
    //add new contact to the list
    public void add(Contact c) {
        //check if list is empty
        if (head == null) {
            head = c;} 
        else{
            //add in alphapitical order 
            Contact temp = head , prev = head;
            while(temp != null)
            {
                if(temp.compareTo(c) > 0)
                {
                    if(temp == head){
                        c.next= head;
                        head=c;
                    }
                    else{
                        prev.next =c;
                        c.next = temp;
                    }
                    return;
                }
                prev = temp;
                temp= temp.next;
            }
            prev.next = c;
        }
    }
    
    //check if we have contact with same name or phone before
    public boolean check(String name , String phone)
    {
        //to each contact in the list 
        Contact temp = head;
        
        while(temp != null)
        {
            //if name or phone equals then return true
            if(temp.name.equals(name) || temp.phone.equals(phone))
                return true;
            temp=temp.next;
        }
        return false;
    }
    
    //search for contact by name
    public Contact SearchByName(String name)
    {
        //to each contact
        Contact temp = head;
        
        while(temp != null)
        {
            //if name equals then return the contact 
            if(temp.name.equals(name))
                return temp;
            temp=temp.next;
        }
        return null;
    }
    
    //search for contact by phone 
    public Contact SearchByPhone(String phone)
    {
        //to each contact
        Contact temp = head;
        while(temp != null)
        {
            //if phone equals then return the contact 
            if(temp.phone.equals(phone))
                return temp;
            temp=temp.next;
        }
        return null;
    }
    
    //search for contacts by email 
    public Contact SearchByEmail(String email)
    {
    	 Contact temp = head;
         while(temp != null)
         {
             //if phone equals then return the contact 
             if(temp.email.equalsIgnoreCase(email))
                 return temp;
             temp=temp.next;
         }
         return null;
     }
     
    
    //search for contacts by address 
    public Contact SearchByAddress(String address)
    {
    	Contact temp = head;
        while(temp != null)
        {
            //if phone equals then return the contact 
            if(temp.address.equalsIgnoreCase(address))
                return temp;
            temp=temp.next;
        }
        return null;
    }
    
    //search for contacts by birth date 
    public Contact SearchByBirth(Date birth)
    {
    	Contact temp = head;
        while(temp != null)
        {
            //if phone equals then return the contact 
            if(temp.birth.equals(birth))
                return temp;
            temp=temp.next;
        }
        return null;
    }
    
    
    //delete a contact based on name
    public boolean delete(String name)
    {
        //to each contact in the list
        Contact temp = head , prev = head;
        while(temp != null)
        {
            //if name equals then delete this contact
            if(temp.name.equals(name))
            {
                if (temp == head)
                    head = head.next;
                else {
                    prev.next = temp.next;
                }
                return true;
            }
            prev = temp;
            temp=temp.next;
        }
        return false;//not found
    }
    
    //search contacts based on first name
    public Contact[] SearchByFirstName(String name)
    {
        //array to store the contacts in
        Contact[] c = new Contact[100];
        int i=0;
        //to each contact in the list
        Contact temp = head;
        while(temp != null)
        {
            //split the name to get the first name 
            String[] nameSplit= temp.name.split(" ");
            //if first name equals then add the contact
            if(nameSplit[0].equals(name))
            {
                c[i++]=temp;
            }
            temp=temp.next;
        }
        return c;
    }
    
    
    
    
}

