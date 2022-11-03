package strings;

public class ExampleThis {
	String Mobile_name;
	int price;
	ExampleThis(String Mobile_name,int price){
		this.Mobile_name=Mobile_name;
		this.price=price;
	}
	void display() {
		System.out.println(Mobile_name+" price is "+price);
	}
	
	public static void main(String arg[])
	{
		ExampleThis realme = new ExampleThis("X7 pro",20000);
		ExampleThis mi = new ExampleThis("Note 11 pro",22000);
		// Now Realme object class refere this keyword make variable Assigining values
		//System.out.println(realme.Mobile_name);
		realme.display();
		mi.display();
	}
}
