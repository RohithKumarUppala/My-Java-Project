package conditionalstatement;

class Person{
	int saveingAmount(int b) {
		return b;
	}
}
class Sales extends Person{
	int insuranceAmount(int a) {
		return a;
	}
}

public class If_Example {

	public static void main(String[] args) {
		
		Sales s = new Sales();
		int sa = s.saveingAmount(15000);
		int in = s.insuranceAmount(20000);
		if(sa>in) {
			System.out.println("Insurance can be purchased");
		}
		System.out.println("Transaction Completed");
		
		// TODO Auto-generated method stub

	}

}
