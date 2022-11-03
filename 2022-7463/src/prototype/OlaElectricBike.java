package prototype;

public class OlaElectricBike implements Cloneable {
	
	private int range=0;
	private String power=null;
	private String chargeTime=null;
	
	public OlaElectricBike(){
		range=80;
		power="5.4 Kwah";
		chargeTime="4 hours";
	}
	public OlaElectricBike clone() {
		return new  OlaElectricBike();
	}
	
	public int getRange() {
		return range;
	}
	
	public void OlaS1pro() {
		range=150;
		power="6.0 kwah";
		chargeTime="3 hours";
	}
	@Override
	public String toString() {
		return "OlaElectricBike \n[range=" + range + "KM \npower=" + power + " \nchargeTime=" + chargeTime + "]\n\n";
	}
	
}
