package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Customer{
	String cname;
	String address;
	int no_of_sim;
	int aadharno;
	public Customer( String cname, String address,int aadharno,int no_of_sim) {
		super();
		this.aadharno = aadharno;
		this.cname = cname;
		this.address = address;
		this.no_of_sim = no_of_sim;
	}
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNo_of_sim() {
		return no_of_sim;
	}
	public void setNo_of_sim(int no_of_sim) {
		this.no_of_sim = no_of_sim;
	}
}
public class SimActivation {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Map<Integer,Customer> act = new HashMap<>();
		Customer c1 = new Customer("Rohith","Hyderbad",33346561,3);
		Customer c2 = new Customer("Nani","Warangal",16515531,5);
		Customer c3 = new Customer("Remanth","Mumbai",33326991,2);
		act.put(1, c1);
		act.put(2, c2);
		act.put(3, c3);
		
		System.out.println("List of People Registered the activation");
		Iterator details = act.entrySet().iterator();
		while(details.hasNext()) {
			Map.Entry<Integer, Customer> record = (Map.Entry<Integer, Customer>) details.next();
			Customer c = (Customer)record.getValue();
			System.out.println(record.getKey()+" Name : "+c.cname+" Address : "+c.address+ " Aadhar no :"+c.aadharno+ " NoOfSim : "+c.no_of_sim);	
		}
		System.out.println("\n\nEnter Yes to Check The Activation");
		String ch = s.nextLine();
		s.close();
		if(ch.equals("yes")) {
			Iterator check = act.entrySet().iterator();
			while(check.hasNext()) {
				Map.Entry<Integer, Customer> record = (Map.Entry<Integer, Customer>) check.next();
				Customer c = (Customer)record.getValue();
				if(c.no_of_sim<5) {
					System.out.println(record.getKey()+"  "+c.cname+" Sim is ACTIVATED");
				}
				else
					System.out.println(record.getKey()+"  "+c.cname+" Sim Will not ACTIVATE");
			}
		
		}
	}
}
