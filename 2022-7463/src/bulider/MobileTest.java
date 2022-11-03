package bulider;

public class MobileTest {

	public static void main(String[] args) {
		
		MobileBulider ip = new IPhone();
		MobileBulider sam = new Samsung();
		
		MobileAssign assign_1 = new MobileAssign(ip);
		MobileAssign assign_2= new MobileAssign(sam);
		
		assign_1.mobile();
		assign_2.mobile();
		
		Mobile ip13 = assign_1.getMobile();
		Mobile S22 = assign_2.getMobile();
		
		System.out.println(ip13);
		System.out.println(S22);
		
	}
}
