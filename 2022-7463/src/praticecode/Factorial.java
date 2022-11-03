package praticecode;
import java.util.Scanner;

public class Factorial {
	public void fact(int n)
	{
		int fac=1;
		System.out.print("Factorial of : "+n);
		for(int i = 1;i<=n;i++) {
			fac=fac*i;
		}
		System.out.print(" is : "+fac);
	}
	public static void main(String[] args) {
		Factorial F =new Factorial();
		try(Scanner s= new Scanner(System.in)){
			System.out.println("Enter the Value of: ");
			int a = s.nextInt();
			F.fact(a);
		}

	}

}
