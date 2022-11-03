package accessmodifier;

class Access{
	//private 
	int a = 10;
}

public class Private_ {

	public static void main(String[] args) {
		
		Access pr = new Access();
		System.out.println(pr.a); //Private Data member outside the class can't be used
		// TODO Auto-generated method stub

	}

}
