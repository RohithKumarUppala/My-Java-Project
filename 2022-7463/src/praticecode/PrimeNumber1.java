package praticecode;
import java.util.Scanner;
public class PrimeNumber1 {

	public static void main(String[] args) {
		int i,num,temp=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = s.nextInt();
		s.close();
		if(num>2){
			for(i=2;i<num;i++) {
				if(num%i==0) {
					temp=i;
					break;
				}
			}
		if(temp!=0)
				System.out.println(num+" is not a prime number because it divisable by "+temp);
		else
			System.out.println(num+" is an Prime Number ");
				
		}
		else if(num==1)
			System.out.println("'1' cant be a prime number ");

	}
}
