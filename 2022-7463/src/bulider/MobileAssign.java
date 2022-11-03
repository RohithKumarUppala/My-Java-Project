package bulider;

public class MobileAssign {
	private MobileBulider mobileBulider = null;
	
	public MobileAssign(MobileBulider mobileBulider) {
		this.mobileBulider=mobileBulider;
	}
	public void mobile() {
		mobileBulider.model();
		mobileBulider.processor();
		mobileBulider.cost();
	}
	public Mobile getMobile() {
		return mobileBulider.getMobile();
	}
}
