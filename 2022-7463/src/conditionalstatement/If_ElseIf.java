package conditionalstatement;
import java.util.Scanner;

class Customer{
	int amount;
}
class Atm extends Customer{
	
	void withdraw(int w) {
		System.out.println("Amount in Account : "+amount);
		if(w<=amount&&w<=20000) {
			amount=amount-w;
			System.out.println("\nAmount Withdraw "+w+"  Sucessfully done\n\nThe new Balance amount is "+amount);
		}
		else if(w>20000){
			System.out.println("withdraw Limit Exceded");
		}
		else if(w>amount){
			System.out.println("Amount is insufficent");
		}
		System.out.println("\nTransaction Successfully Completed");
	}
}

public class If_ElseIf {
	
	public static void main(String arg[]) {
	
		Atm sbi = new Atm();
		sbi.amount=10000;
		try(Scanner s = new Scanner(System.in)){
		System.out.println("Enter Withdraw amount");
		int w = s.nextInt();
		sbi.withdraw(w);
		}
	}
}
