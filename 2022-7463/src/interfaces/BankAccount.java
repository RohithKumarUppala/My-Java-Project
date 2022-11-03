package interfaces;

import java.util.Scanner;
public class BankAccount implements Transaction {
	int balance;
	void openbal(int bal) {
		balance=bal;
		System.out.println("opening balance is "+balance+"\n\n");
	}
	public void checkIssue(int srt) {
		int serial[] = new int[10];
		int count=srt;
		for(int i=0;i<serial.length;i++) {
			serial[i]=count;
			count++;
		}
		System.out.println("The Check Issued with Serialnumbers: ");
		for(int i:serial)
			System.out.print(" "+i);
	}
	public void withdraw(int amt){
		if(amt>999) {
			balance-=amt;
			System.out.println("New balance is "+balance);
		}
		else if(amt<1000&&amt>=0) {
			System.out.println("amount to withdraw having limt start from 1000");
		}
		else
			System.out.println("Inavlid number");
	}
	public void deposit(int amt) {
		if(amt<99&&amt>=0) {
			System.out.println("Minimum amt to deposit 100");
		}
		else if(amt>=100) {
			balance+=amt;
			System.out.println("New balance is "+balance);
		}
		else
			System.out.println("Inavlid number");
	}
	/*public void checkWithdraw(int ch_id,int amt){
		
	}*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i=0;
		BankAccount Ac1 = new BankAccount();
		System.out.println("Account opening Balance");
		Ac1.openbal(s.nextInt());
		System.out.println("To issue a Check enter yes");
		s.nextLine();
		if((s.nextLine()).equals("Yes")) {
			
			Ac1.checkIssue(s.nextInt());
		}
		do {
			System.out.println("Enter \nW for Withdraw \nD for Deposit  \nE for exit Transaction");
			String str = s.nextLine();
			if(str.equals("w")) {
				System.out.println("Enter Amount to withdraw");
				int a=s.nextInt();
				Ac1.withdraw(a);
				System.out.println(a+" is withdraw Succesfully \n\n");
				s.nextLine();
				i++;
			}
			else if(str.equals("d")) {
				System.out.println("Enter Amount to deposit");
				int a=s.nextInt();
				Ac1.deposit(a);
				System.out.println(a+" is Deposited Succesfully \n\n");
				s.nextLine();
				i++;
			}
			else if(str.endsWith("c")) {
				System.out.println("Enter the CheckNumber");
				
			}
			else if(str.equals("e")) {
				break;
			}
			else {
				System.out.println("invalid Character");
			}
		}while(i<10);
		s.close();
		System.out.println("Transaction Completed");
	}

}
