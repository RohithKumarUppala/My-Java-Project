package polymorpism;

class OverloadingOrder{
	
	public void detail(String name,int id) {
	
		System.out.println("My name is "+name+" ID is "+id);
	
	}
	
	public void detail(int id,String name) {
		
		System.out.println("My name is "+name+" ID is "+id);
		
	}
}

public class ChangeInOrder {

	public static void main(String[] args) {
		
		OverloadingOrder o = new OverloadingOrder();
		o.detail(105,"Rohith");
		o.detail("Kittu",210);
		// TODO Auto-generated method stub
	}

}
