package polymorpism;
import java.util.Scanner;

class TypeParaOverloading{
	public void dis(int num) {
		System.out.println("A value :"+num);
	}
	public void dis(char a,int num) {
		System.out.println(a+" value"+num);
	}
}

public class OverloadingType{

	public static void main(String[] args) {
		
		TypeParaOverloading T = new TypeParaOverloading();
		try(Scanner s = new Scanner(System.in)){
		System.out.println("Enter Integer :");
		int q = s.nextInt();
		T.dis(q);
		}
		T.dis('U',105);
		// TODO Auto-generated method stub

	}

}
