package constructor;

class AutoMethod{
	String cons;
	AutoMethod(){
		System.out.println("Called Automatically Method When object is created");
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		AutoMethod var= new AutoMethod();
		var.cons = "Constructor";
		System.out.println(var.cons);
		
		//System.out.println(new AutoMethod());
		// TODO Auto-generated method stub
	}

}
/*Similar to methods, a Java constructor may or may not have any parameters (arguments).

If a constructor does not accept any parameters, it is known as a no-argument */
