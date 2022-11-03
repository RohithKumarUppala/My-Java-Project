package collection;

import java.util.*;

class StudentDetails{
	Integer sid;
	String sname;
	public StudentDetails(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StudentDetails [sid=" + sid + ", sname=" + sname + "]";
	}	
}
class StudentComparator implements Comparator<StudentDetails>{
	public int compare(StudentDetails s1,StudentDetails s2) {
		return (s1.sid).compareTo(s2.sid);
	}
}
class Student{
	public static void main(String arg[]) {
		
		TreeSet<StudentDetails> ts = new TreeSet<StudentDetails>(new StudentComparator());
		
		ts.add(new StudentDetails(3,"rohtih"));
		ts.add(new StudentDetails(2,"nani"));
		ts.add(new StudentDetails(1,"danny"));
		
		for(StudentDetails student : ts)
			System.out.println(student );
	}
}