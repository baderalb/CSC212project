class Node<T>
{
	public T data;
	public Node<T> next;
	public Node(T d) {
		next=null;
		data=d;
	}
}

public class LinkedList<T> {
	private Node<T>head;
	private Node<T> current;
	public LinkedList () {
	head = current = null;
	}
	public boolean isempty () {
	return head == null;
	}
	public boolean last () {
	return current.next == null;	
	
	}
	public boolean full () {
		return false; }
		public void findfirst () {
		current = head;
		}
		public void findnext () {
		current = current.next; }
		public T retrieve () {
		return current.data; }
		public void update (T d) {
		current.data = d; 
}

		public void insert (T value) {
			Node<T> p;
			if (isempty()) {
			current = head = new Node<T> (value);
			}
			else {
			p= current.next;
			current.next = new Node<T> (value);
			current = current.next;
			current.next = p;
			}
		}
		public void remove () {
			if (current == head) {
			head = head.next;
			}
			else {
			Node<T> tmp = head;
			while (tmp.next != current)
			tmp = tmp.next;
			tmp.next = current.next;
			}
			if (current.next == null)
			current = head;
			else
			current = current.next;
		}

		
		
public boolean search(T X) {
	Node<T>temp=head;
	while(temp!=null) {
		if(temp.data.equals(X))
			return true;
		else
			temp=temp.next;
	}
	return false;
}
public void display() {
	Node cuurent=head;
	while(cuurent!=null) {
		System.out.print(cuurent.data+ "");
		cuurent=cuurent.next;
	}
}
public void AddSorted2(T d) {
	Node<T> p=new Node<T>(d);
	if (head == null) {
		head = p;
		current = p;
		return;

	} else {
		if (((Contact) d). compareTo((Contact) head.data) < 0) {
			p.next = head;
			head = p;
			return;
		} else {
			Node<T> r = head,
			q = null;
			while (r != null && (((Contact) r.data).compareTo(((Contact) d).getContactname()) <= 0)) {
				q = r;
			r = r.next;
		}
		q.next = p;
		p.next = r;
	}
}
}
}











	

