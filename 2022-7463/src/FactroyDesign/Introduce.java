package FactroyDesign;

import java.util.Scanner;

public class Introduce {

	public static void main(String[] args) {
		MobileMarket MM = new MobileMarket();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the Company");
			String com = s.nextLine();
			if(com.equalsIgnoreCase("realme")) {
				Realme rel= (Realme)MM.create("realme");
				String processor,battery,Ram,Storage,Display;
				System.out.println("Enter Model name");
				rel.setModel(s.nextLine());
				System.out.println("\n Enter the Price of "+rel.getModel());
				rel.setCost(s.nextDouble());
				s.nextLine();
				System.out.println("\n Enter Processor");
				processor=s.nextLine();
				System.out.println("Enter Battery");
				battery = s.nextLine();
				System.out.println("Enter Ram");
			    Ram = s.nextLine();
			    System.out.println("Enter Storage");
				Storage = s.nextLine();
				System.out.println("Enter Dispaly");
				Display = s.nextLine();
				rel.setFeature(processor, battery, Ram, Storage, Display);
				
				rel.model();
				rel.price();
				rel.features();
			}
			else if(com.equalsIgnoreCase("redmi"))
			{
				Redmi red= (Redmi)MM.create("redmi");
				String processor,battery,Ram,Storage,Display;
				System.out.println("Enter Model name");
				red.setModel(s.nextLine());
				System.out.println("\n Enter the Price of "+red.getModel());
				red.setCost(s.nextDouble());
				s.nextLine();
				System.out.println("\n Enter Processor");
				processor=s.nextLine();
				System.out.println("Enter Battery");
				battery = s.nextLine();
				System.out.println("Enter Ram");
			    Ram = s.nextLine();
			    System.out.println("Enter Storage");
				Storage = s.nextLine();
				System.out.println("Enter Dispaly");
				Display = s.nextLine();
				red.setFeature(processor, battery, Ram, Storage, Display);
				
				red.model();
				red.price();
				red.features();
			}
		}
		
	}

}
