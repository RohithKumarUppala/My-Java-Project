package inheritance;

class Mobiles{
	int ram,rom,processor;
}
class Iphone extends Mobiles{
	
	float price = 100000;
	
}
class OnePlus extends Mobiles{
	float price = 50000;
	
}
public class Hierarchical {
	public static void main(String arg[]) {
		
		Iphone se = new Iphone();
		se.ram=4;
		se.rom=64;
		se.processor=756;
		System.out.println("Iphone details RAM :"+se.ram+"GB\nROM :"+se.rom+"GB\nProcessor :"+se.processor+"SD\nPrice"+se.price);
		
		OnePlus O = new OnePlus();
		O.ram=8;
		O.rom=256;
		O.processor=888;
		System.out.println("Oneplus details RAM :"+O.ram+"GB\nROM :"+O.rom+"GB\nProcessor :"+O.processor+"SD\nPrice"+O.price);
	}
	

}
