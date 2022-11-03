package abstraction;
abstract class Details{
	abstract void e_details(int eid, String ename,long enumber);
	abstract void e_address(String addr);
	//abstract void qualification(String qua);
}

class Employee extends Details{
	
	Employee(String loc){
	System.out.println("Office Location "+loc);	
	}
	void e_details(int eid, String ename,long enumber) {
		System.out.println("Employee Name : "+ename+"\n Employee ID : "+eid+"\n Employee mobile number"+enumber);
	}
	void e_address(String addr) {
		System.out.println("Address of an Employee is located :-"+addr);
	}
	void qualification(String qua){
		System.out.println("Qualification of Employee :"+qua);
	}
	
	
		public static void main(String[] args) {
		
			Employee A = new Employee("Gachibowli");
			A.e_details(2521, "Uppala Rohith Kumar",987456123);
			A.e_address("Hyderabad, Telangana");
			A.qualification("MCA");
			//Details B = new Employee("Hyderabad");
		}
}

