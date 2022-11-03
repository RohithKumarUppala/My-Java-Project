package collection;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Ekart{
	
	String productname;
	int price;
	public Ekart(String productname, int price) {
		super();
		this.productname = productname;
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ekart [" + productname + ", price=" + price + "]\n";
	}
	
}

public class Order_Id {
	
	Scanner s = new Scanner(System.in);
	
	void search(Map<Integer,Ekart> order) {
		System.out.println("\nEnter the Order ID to Search");
		int n = s.nextInt();
		switch(n) {
		case 2145:System.out.println("Order id 2145 :"+order.get(2145));
					break;
		case 2146:System.out.println("Order id 2146 :"+order.get(2146));
					break;
		case 2147:System.out.println("Order id 2147 :"+order.get(2147));
					break;
		case 2148:System.out.println("Order id 2148 :"+order.get(2148));
					break;
		case 1145:System.out.println("Order id 1145 :"+order.get(1145));
					break;
		case 1146:System.out.println("Order id 1146 :"+order.get(1146));
					break;
		default : System.out.println("Order ID not Valid");
				  search(order);
		}
	}
	
	public static void main(String[] args) {
		
		Order_Id ob = new Order_Id();
		Scanner s = new Scanner(System.in);
		Map<Integer,Ekart> order1 = new HashMap<>();
		Ekart e1 = new Ekart("Iphone 12",54999);
		Ekart e2 = new Ekart("Contact Lens",2499);
		Ekart e3 = new Ekart("Water Purifier",15999);
		Ekart e4 = new Ekart("Allen Solly Shirt",999);
		
		order1.put(2145, e1);
		order1.put(2146, e2);
		order1.put(2147, e3);
		order1.put(2148, e4);
		
		System.out.println("List of Order1 in Cart\n"+order1);
		
		Map<Integer,Ekart> order2 = new HashMap<>();
		
		order2.put(1145,new Ekart("Mobile case",399));
		order2.put(1146,new Ekart("Mobile charger",599));
		
		System.out.println("\n\nList of Order2 in Cart\n"+order2);
		
		System.out.println("\n\nMerging Order 2 in Order 1 ");
		
		order1.putAll(order2);
		/*Iterator display = order1.entrySet().iterator();
		while(display.hasNext()) {
			Map.Entry<Integer, Ekart> de = (Map.Entry<Integer,Ekart>) display.next();
			Ekart e = (Ekart)de.getValue();
			System.out.println(de.getKey()+" "+e.price+"  "+e.productname);
		}*/
		System.out.println(order1);
		
		order1.replace(2145, e1, new Ekart("Iphone 13",79999));
		
		System.out.println("\n\nAfter replacing Order 2145\n"+order1);
		
		Set<Integer> order_id = order1.keySet();
		System.out.println("Total Order ID's are"+order_id);
		
		ob.search(order1);
		
		System.out.println("Enter Order ID to Check Id is there or not");
		int number = s.nextInt();
		boolean check = order1.containsKey(number);
		System.out.println(number+" order Id is "+check);
		s.close();
	}

}
