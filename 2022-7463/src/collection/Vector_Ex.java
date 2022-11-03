package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Names{
	
	Scanner s = new Scanner(System.in);
	Vector<Integer> v = new Vector<>();
	
	void display() {
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
			System.out.println("  "+it.next());
		System.out.println("\n\n");
	}
}

public class Vector_Ex {

	public static void main(String[] args) {
		
		Names n = new Names();
		n.v.add(20);
		n.v.add(45);
		n.v.add(54);
		
		n.display();
		
		n.v.add(1, 25);
		n.display();
		
		n.v.removeAllElements();
		n.display();

	}
}
