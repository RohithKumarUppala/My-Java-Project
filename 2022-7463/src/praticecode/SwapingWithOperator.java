package praticecode;

public class SwapingWithOperator {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("Before swaping values "+a+" "+b);
		a=a*b;//now a = 200
		b=a/b;//now b= 200/20 then 10
		a=a/b;//here a= 200 and changed b is 10 the now a=200/10 is 20
		System.out.println("After swaping values "+a+" "+b);
		// TODO Auto-generated method stub

	}

}
