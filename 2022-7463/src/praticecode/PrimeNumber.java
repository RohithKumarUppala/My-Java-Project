package praticecode;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int i,num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr the number :");
		num = s.nextInt();
		s.close();
		if(num>2){
			for(i=2;i<num;i++) {
				if(num%i==0) {
					System.out.println(num+" is not an prime number because it is Divisible by "+i);
					break;
				}
				else if(num==i+1)
						System.out.println(num+" is a prime number");
			}
		}
		else if(num==1)
			System.out.println("Given number 1 can't be prime number");
		else	
			System.out.println(num+" is a invalid");
	}
}
