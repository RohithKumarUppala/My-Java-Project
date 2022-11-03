package conditionalstatement;
import java.util.Scanner;

class  Phone{
	public void check(int n,short ram,String mn) {
		if(n>15000&&n<30000) {
			System.out.println("Given Phone price "+n+" comes under Perfect price for "+mn);
			
			if(ram>=6&&ram<=8) 
				System.out.println(ram+" GB Ram is in "+n+" buget is Excellent ");
			
			else if(ram<=4&&ram>0) 
				System.out.println(ram+" GB Ram is to Low at "+n+" Rs");
			
			else
				System.out.println("Invalid Ram");
		}
		else if(n<15000&&n>0) {
			System.out.println(n+" Rs is low varient mobile phone "+mn);
			
			if(ram>4&&ram<6)
				System.out.println(mn+" Is considerable Mobile phone because it has "+ram+" Gb in Specification");
			else
				System.out.println("Specification Not upto the Mark");
		}
		
		else if(n>30000) {
			if(ram>=12)
				System.out.println("Considerable but also a to high");
			
			System.out.println(n+" Rs is Very high Price varient out of buget go and Check Iphone not Android");
		}
		else 
			System.out.println("invalid Amount");
	}
}
public class NestedIf {

	public static void main(String[] args) {
		
		Phone realme = new Phone();
		try(Scanner s = new Scanner(System.in)){
			
			System.out.println("Enter the name of Mobile : ");
			String name = s.nextLine();
			
			System.out.println("Enter price of an mobile : ");
			int rs = s.nextInt();
			
			System.out.println("Enter the ram of an mobile : ");
			short ra = s.nextShort();
			
			realme.check(rs, ra, name);
			
		}
	}

}
