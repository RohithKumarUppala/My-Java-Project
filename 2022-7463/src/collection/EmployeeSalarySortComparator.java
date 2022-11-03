package collection;

import java.util.*;
class Employee{
	private String Ename;
	private int salary;
	Employee(String Ename,int salary){
		this.Ename=Ename;
		this.salary=salary;
	}
	public String getEname(){
		return Ename;
	}
	public Integer getSalary() {
		return salary;
	}
	public String toString() { //overrides main toString
		return "Employee { Name :"+Ename+"  Salary :"+salary+" }";
	}
}
class EmployeeSalarySortComparator implements Comparator<Employee>{
	public int compare(Employee Emp1,Employee Emp2) {
		int enamecompare = Emp1.getEname().compareTo(Emp2.getEname());
		int salarycompare = Emp1.getSalary().compareTo(Emp2.getSalary());
		
		return (enamecompare==0)? salarycompare:enamecompare;
	}	

	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee("Rohith",50000);
		Employee e2 = new Employee("Arun",30000);
		Employee e3 = new Employee("Nani",20000);
		Employee e4 = new Employee("Remanth",15000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Iterator<Employee> it = al.iterator();
		
		while(it.hasNext()) 
			System.out.println(it.next());
		
		System.out.println("\n\nSorted EMployee\n\n");
		
		
		Collections.sort(al,new EmployeeSalarySortComparator());
		
		for(Employee e:al) 
			System.out.println(e);
	}

}
/*class Student{
	String Sname;
	Student(String Sname){
		this.Sname=Sname;
	}
	public String toString(){
		return Sname;
	}
}*/
