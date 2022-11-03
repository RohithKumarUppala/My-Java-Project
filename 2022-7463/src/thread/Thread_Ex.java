package thread;

import java.util.Scanner;

public class Thread_Ex {
	Scanner s = new Scanner(System.in);
	String sname;
	int rollid;
	public void run() {
		System.out.println("Enter the name and Roll no ");
		sname=s.nextLine();
		rollid=s.nextInt();
		System.out.println(sname +"AND  Rool id:"+rollid);
	}
}
class Thread_Ex1 extends Thread_Ex implements Runnable{
	public void run() {
		System.out.println("Given Details");
		System.out.println(sname +"AND  Rool id:"+rollid);
	}
	public void main(String arg[]) {
		Thread_Ex1 t1 = new Thread_Ex1();
		
		Thread s =  new Thread(t1);
		
		
		s.start();
	}
}
