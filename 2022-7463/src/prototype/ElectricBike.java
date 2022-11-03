package prototype;

public class ElectricBike {

	public OlaElectricBike proVersion(OlaElectricBike s1) {
		s1.OlaS1pro();
		return s1;
	}
	
	public static void main(String[] args) {
		
		OlaElectricBike basic = new OlaElectricBike();
		OlaElectricBike s1 = basic.clone();
		System.out.println(s1);
		ElectricBike ev = new ElectricBike();
		ev.proVersion(s1);
		System.out.println(s1);
	}

}
