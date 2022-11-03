package collection;

import java.util.*;


public class TreeSet_ex {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>(); 
		String s1 = new String("Rohtih");
		String s2 = new String("Arun");
		String s3 = new String("Nani");
		String s4 = new String("Danny");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		System.out.println(s+"\n");
		
		TreeSet<String> ts = new TreeSet<>(s);
		
		System.out.println(ts+"\n");
		
		System.out.println("First Element :"+ts.first());
		System.out.println("last Element :"+ts.last());
		
		System.out.println("Element near to aruna :"+ts.floor("Aruna"));
		System.out.println("Element near to Nano: "+ts.ceiling("Nano"));
	
		System.out.println("headset Element :"+ts.headSet(s3, true));
		System.out.println("tailset Element :"+ts.tailSet(s4, true));
	}

}
