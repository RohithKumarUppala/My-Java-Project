package exception;

public class Throws {
	
	int balance;
	public void accountopen(String name,int bal) throws IllegalArgumentException, NullPointerException {
		if(bal<10000&&bal>0)
			throw new IllegalArgumentException(name+"  "+bal+" \nbalance account not opened because lessthen 10000 ");
		else if(bal==0)
			throw new NullPointerException(name+" Zero balance is not applicable");
		else
			System.out.println("\n"+name+"  Account is opened and opening balance is :"+bal);
	}
	public static void main(String[] args) {
	Throws 	rohtih = new Throws();
	Throws 	arun = new Throws();
	Throws  student = new Throws();
	try {
		rohtih.accountopen("rohtih",rohtih.balance=12000);
		arun.accountopen("arun",arun.balance=9000);
		student.accountopen("Student", 0);
	}
	catch(IllegalArgumentException e) {
		System.out.println("\n"+e+"\nMinimum amount to open a balance is 10000 \n");
	}
	catch(NullPointerException e) {
		System.out.println(e+"\nzero balance account is not possiable \n");
	}	
	}

}
