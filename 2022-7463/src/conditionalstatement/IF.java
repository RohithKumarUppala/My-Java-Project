package conditionalstatement;

public class IF {

	public static void main(String[] args) {
		
		int bal_amount = 10000;
		int withdraw = 11000;
		if(withdraw<=bal_amount) {
			bal_amount=bal_amount-withdraw; 
			System.out.println("Amount Withdraw "+withdraw+"  Sucessfully done\n The new Balance amount is "+bal_amount);
		}
		System.out.println("Transaction Completed");
		// TODO Auto-generated method stub
	}

}
