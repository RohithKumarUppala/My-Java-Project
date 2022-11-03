package constructor;

class Addition{
	Addition(int a,int b){
		System.out.println("Addition of two values ("+a+") and ("+b+") is : "+(a+b));	
	}
	Addition(float a,float b){
		System.out.println("Addition of two values ("+a+") and ("+b+") is : "+(a+b));	
	}
	Addition(double a,double b){
		System.out.println("Addition of two values("+a+") and ("+b+") is : "+(a+b));	
	}
}

public class PrameterizedConstructor {

	public static void main(String[] args) {
		
		new Addition(25,35);
		new Addition(1.5,3.5);
		new Addition(63.01544,36.98456);
		// TODO Auto-generated method stub

	}

}
