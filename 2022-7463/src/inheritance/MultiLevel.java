package inheritance;

class University{
	String list;
	int mca,mba,msc;
	void listCourse() {
		list= "List of Courses we have for PG\nMCA\nMBA\nMsc(Maths,physics,Computer science)";
		System.out.println(list);
	}
	void fee(int a,int b,int c) {
		mca=a;
		mba=b;
		msc=c;		
	}
	void loc() {
		System.out.println("Tarnaka,Telangana");
	}
	
} 
class College extends University{
	void mcafee() {
		System.out.println("Mca Fee is:"+mca);
	}
	void mbafee() {
		System.out.println("Mba Fee is:"+mba);
	}
	void mscfee() {
		System.out.println("Msc Fee is:"+msc);
	}
	void loc() {
		System.out.println("Hyderabad,Telangana");
	}
}
class Student extends College{
	String name,address;
	void setDetails(String X,String Y) {
		name=X;
		address=Y;
	}
	void getDetails() {
		System.out.println("Name:"+name+"\nAddress:-"+address);
	}
	void loc() {
		System.out.println("Aramghar,Telangana");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Student s = new Student();
		s.setDetails("Rohith","Hyderabad");
		s.fee(30000, 40000, 45000);
		s.getDetails();
		s.listCourse();
		s.mcafee();
		s.loc();
		
		 //TODO Auto-generated method stub

	}

}
