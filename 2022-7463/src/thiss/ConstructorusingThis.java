package thiss;

import java.util.Scanner;

class Sum{
	
	int a,b,c;
	Sum(){
		this(10,20,30);
	}
	Sum(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Sum of two Elements :"+(a+b));
	}
	Sum(int a,int b,int c){
		this(a,b);
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Sum of three Elements :"+(a+b+c));
	}
}

public class ConstructorusingThis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three element one by one");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		Sum ob = new Sum(a,b,c);
		ob.toString();
		s.close();
	}

}
