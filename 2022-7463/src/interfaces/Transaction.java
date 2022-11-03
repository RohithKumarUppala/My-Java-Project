package interfaces;

public interface Transaction {
	abstract void checkIssue(int srt);
	abstract void withdraw(int amt);
	abstract void deposit(int amt);
	//abstract void checkWithdraw(int ch_id,int amt);
}

