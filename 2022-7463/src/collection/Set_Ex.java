package collection;

import java.util.*;

public class Set_Ex {
	
	Scanner sc = new Scanner(System.in);
	void insertion(Set<String> s,int size) {
		System.out.println("Enter the Elements one by one");
		for(int i=0;i<size;i++) {
			s.add(sc.nextLine());
		}
	}
	void display(Set<String> s) {
		if(s.isEmpty()) {
			System.out.println(s+"Set is Empty");
		}
		else
			System.out.println("Set Elements Are :"+s);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Set_Ex obj = new Set_Ex();
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		obj.display(set1);
		obj.display(set2);
		System.out.println("Enter the Size of the Sets");
		int size = s.nextInt();
		s.next();
		obj.insertion(set1, size);
		obj.display(set1);
		
		obj.insertion(set2, size);
		obj.display(set2);
		s.close();
		System.out.println("Is there is Set1 contain all elemnets of Set 2 is "+set1.containsAll(set2));
		System.out.println("Is there is Set1 retains all elemnets of Set 2 is "+set1.retainAll(set2));
	}

}
