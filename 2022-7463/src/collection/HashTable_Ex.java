package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class ParkingDetails{
	String name;
	String Numberplate;
	public ParkingDetails(String name, String numberplate) {
		super();
		this.name = name;
		Numberplate = numberplate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberplate() {
		return Numberplate;
	}
	public void setNumberplate(String numberplate) {
		Numberplate = numberplate;
	}
	@Override
	public String toString() {
		return  name + "  "+ Numberplate ;
	}
	
}

public class HashTable_Ex {

	public static void main(String[] args) /*throws*/ {
		
		Scanner s = new Scanner(System.in);
		Map<Integer,ParkingDetails> dir= new Hashtable<Integer,ParkingDetails>();
		dir.put(1,new ParkingDetails("Rohith","TS07GV3672"));
		dir.put(2,new ParkingDetails("Sunil","TS07EX1210"));
		dir.put(3, new ParkingDetails("Aravind","TS07GX20120"));
		dir.put(4, new ParkingDetails("Anand","TS07LX6547"));
		dir.put(5, new ParkingDetails("Govind","TS07YT8475"));
		dir.put(6, new ParkingDetails("Rajaram","TS07LY9587"));
		
		for(Map.Entry<Integer,ParkingDetails> p :dir.entrySet()) {
			System.out.println(p.getKey()+ " "+ p.getValue());
		}
		Iterator it = dir.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,ParkingDetails> record = (Map.Entry<Integer, ParkingDetails>)it.next();
			ParkingDetails p = (ParkingDetails)record.getValue();
			Iterator ite = dir.entrySet().iterator();
			while(ite.hasNext()) {
				System.out.println("\n\nEnter the Key number to remove\n");
				int key = s.nextInt();
				s.close();
				dir.remove(key);
				for(Map.Entry<Integer,ParkingDetails> pa :dir.entrySet()) {
					System.out.println(pa.getKey()+ " "+ pa.getValue());
				}
				System.out.println("Number Of Vehciles :"+dir.size());
				
			}
		}
	}

}
