package collection;

import java.util.Iterator;
import java.util.LinkedList;

class Collection{
	
	LinkedList<String> ll = new LinkedList<>();
	
	void display() {
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
			System.out.println("  "+it.next());
	}
	
}

public class LinkedList_Ex {

	public static void main(String[] args) {
		
		Collection c = new Collection();
		c.ll.add("Rohith");
		c.ll.add("Arun");
		c.ll.add("Akhil");
		c.ll.add("Nani");
		
		
		c.display();
		
		c.ll.add("RRR");
		c.display();
	}

}
