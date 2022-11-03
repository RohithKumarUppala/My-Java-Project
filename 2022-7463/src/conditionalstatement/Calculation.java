package conditionalstatement;
import java.util.Scanner;
public class Calculation {
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int mod(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		Calculation a = new Calculation();
		System.out.println("Enter value\n1.Addition\n2.substraction\n3.Multiplication\n4.Modules");
		try(Scanner s = new Scanner(System.in)){
			int x,y,ch;
			ch = s.nextInt();
			System.out.println("Enter two values");
			x = s.nextInt();
			y = s.nextInt();
			switch(ch) {
			case 1:System.out.println("Addition of "+x+" and "+y+" is "+a.add(x, y));
				break;
			case 2:System.out.println("Addition of "+x+" and "+y+" is "+a.add(x, y));
				break;
			case 3:System.out.println("Addition of "+x+" and "+y+" is "+a.add(x, y));
				break;
			case 4:System.out.println("Addition of "+x+" and "+y+" is "+a.add(x, y));
				break;
			default: System.out.println("Invalid enter");
			}
			
		}

	}

}
