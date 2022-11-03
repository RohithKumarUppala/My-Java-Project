package collection;

import java.util.*;

class Elements{
	Queue<String> q = new PriorityQueue<String>();
	
	void display() {
		Iterator<String> it = q.iterator();
		while(it.hasNext())
		{
			System.out.print("  "+it.next());
		}
	}
}

public class Queue_Ex {

	public static void main(String[] args) {
		Elements E = new Elements();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Queue Elements");
		int count=0;
		while(count<5)
		{
			E.q.add(s.nextLine());
			count++;
		}
		E.display();
		String peek = E.q.peek();
		System.out.println("\nFirst Element "+peek);
		String poll =E.q.poll();
		peek=E.q.peek();
		System.out.println("\n\nRemoving First Element "+poll+"\n\nNext First Element is  "+peek);
		
		E.display();
		s.close();
		
	}

}
