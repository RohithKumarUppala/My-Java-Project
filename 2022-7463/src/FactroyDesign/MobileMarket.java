package FactroyDesign;

public class MobileMarket {

	public MobileMarket() {
		
	}
	IMobile create(String type) {
		IMobile mo = null;
		if(type.equalsIgnoreCase("realme")) {
			mo = new Realme();
			System.out.println("\nNew Mobile Of realme Created\n");
			return mo;
		}
		else if(type.equalsIgnoreCase("redmi")) {
			mo = new Redmi();
			System.out.println("\nNew Mobile Of Redmi Created");
			return mo;
		}
		
		return mo;
	}
}
