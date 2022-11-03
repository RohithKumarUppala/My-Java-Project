package static__;

class Employee{
	
	int numberOfEmp=0;
	private String ename;
	private int eid;
	static String location="Hyderabad";
	Employee(String ename,int eid){
		this.eid=eid;
		this.ename=ename;
		numberOfEmp++;
	}
	void display() {
			System.out.println("\nEmployee Name is "+ename+ " \n and Employee id is "+eid+"\n"
					+ " Working Location is "+location );
	}
	/*public static void numberOfEmp() {
		System.out.println("\nNumber of employees  :-"+numberOfEmp);
	}*/
}

public class Static_Example {

	public static void main(String[] args) {
		
		Employee E1 = new Employee("Rohith",105);
		Employee E2 = new Employee("Arun",83);
		Employee E3 = new Employee("Akhil",95);
		E1.display();
		E2.display();
		E3.display();
		System.out.print(E3.numberOfEmp);
		//Employee.numberOfEmp();
	}

}
