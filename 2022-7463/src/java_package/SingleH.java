package java_package;

class Math{
	int a,b,mul,sub;
	void get(int x,int y){
		a=x;
		b=y;
	}
	
}
class Operation extends Math {
	void multi() {
		mul=a*b;
		System.out.println("Multiple of"+a+"and"+b+"is :"+mul);
	}
	void subs() {
		sub=a-b;
		System.out.println("Multiple of"+a+"and"+b+"is :"+sub);
	}
}
public class SingleH{
	
	public static void main(String arg[]) {
	Operation a = new Operation();
	a.get(25, 15);
	a.multi();
	a.subs();
	}
}
