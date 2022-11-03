package exception;

class MinimumBalanceException extends IllegalArgumentException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MinimumBalanceException(String str){
		super(str);
	}
}
class ZeroBalanceException extends  NullPointerException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ZeroBalanceException(String str){
		 super(str);
	 }
}

public class BankAccount {
	int balance;
	public void accountopen(String name,int bal) {
		if(bal<10000&&bal>0)
			throw new MinimumBalanceException(name+"  "+bal+" \nbalance account not opened because lessthen 10000 ");
		else if(bal==0)
			throw new ZeroBalanceException(name+" Zero balance is not applicable");
		else
			System.out.println("\n"+name+"  Account is opened and opening balance is :"+bal);
	}
	public static void main(String[] args) {
		BankAccount rohtih = new BankAccount();
		BankAccount arun = new BankAccount();
		BankAccount student = new BankAccount();
		try {
			rohtih.accountopen("rohtih",rohtih.balance=12000);
			arun.accountopen("arun",arun.balance=9000);
			student.accountopen("Student",student.balance=0);
		}
		catch(MinimumBalanceException e) {
			System.out.println("\n"+e+"\nMinimum amount to open a balance is 10000 \n");
		}
		catch(ZeroBalanceException e) {
			System.out.println(e+"\nzero balance account is not possiable \n");
		}	

	}

}
