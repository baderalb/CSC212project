
import java.util.*;
public class Contact implements Comparable{

    //name, phone number, email address, address, birthday, and notes
    String name;
    String phone;
    String email;
    String address;
    Date birth;
    String notes;
    Contact next;
    Event head;

    public Contact(String name, String phone, String email, String address, Date birth, String notes) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birth = birth;
        this.notes = notes;
        next=null;
        head = null;
    }

    @Override
    public int compareTo(Object o) {
       return this.name.compareTo(((Contact)o).name);

    }

     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Phone Number: ").append(phone).append("\n");
        sb.append("Email Address: ").append(email).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Birthday: ").append(birth).append("\n");
        sb.append("Notes: ").append(notes).append("\n");
        return sb.toString();
    }

}

