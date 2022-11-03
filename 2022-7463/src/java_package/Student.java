package java_package;

class Edubridge{
	
	String course = "JAVA Full Stack";
	int batch_no = 7463;
	void display()
	{
		System.out.println("Course:-"+course+"\nBatch number:-"+batch_no);
	}
	
	
}

public class Student extends Edubridge {
	
	int st_id;
	String st_name;
	
	public static void main(String arg[])
	{
		Student s1 = new Student();
		s1.st_id = 101;
		s1.st_name = "Rohith";
		
		System.out.println("Student Name:-"+s1.st_name+"\nStudent Id:-"+s1.st_id);	
		s1.display();
	}
}
