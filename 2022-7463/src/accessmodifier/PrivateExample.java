package accessmodifier;

class Private{
	private long mobile_no;
	
	public void setMobile(long mobile_no) {
		
		this.mobile_no = mobile_no;		
	}
	public long getMobile() {
		return mobile_no;
	}
	
}
public class PrivateExample{
	
	public static void main(String arg[]) {
		
		Private p = new Private();
		p.setMobile(9876543210l);
		long num = p.getMobile();
		System.out.println("My Mobile Number is :- "+num);
	}
	

}
