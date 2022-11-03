package bulider;

import java.util.Scanner;
public class IPhone implements MobileBulider {
	
	Mobile mo;
	Scanner s = new Scanner(System.in);
	public IPhone(){
		mo = new Mobile();
	}
	@Override
	public void model() {
		System.out.println("Enter The iphone Model:-");
		mo.setModel(s.nextLine());
	}

	@Override
	public void processor() {
		System.out.println("Enter The "+mo.getModel()+ " Processor:-");
		mo.setProcessor(s.nextLine());;
	}

	@Override
	public void cost() {
		System.out.println("Enter The "+mo.getModel()+ " Cost:-");
		mo.setCost(s.nextLine());;
	}

	@Override
	public Mobile getMobile() {
		return mo;
	}

}
