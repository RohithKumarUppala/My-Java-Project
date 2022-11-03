package polymorpism;

class Wavelength{
	
	void frequency(int a) {
		System.out.println("Frequency Range Of all Types");
	}
}
class Radiowaves extends Wavelength{
	void frequency(int a) {
		System.out.println("Frequency Range Of Radio wave Start :>="+a+"MHz");
	}
}
class Microwaves extends Radiowaves{
	void frequency(int a) {
		System.out.println("Frequency Range Of Micro wave Start :"+a+"GHz");
	}
}
class Infrared extends Microwaves{
	void frequency(int a) {
		System.out.println("Frequency Range Of Infrared Start :"+a+"THz");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Wavelength W = new Wavelength();
		Infrared I = new Infrared();
		Microwaves M = new Microwaves();
		Radiowaves R = new Radiowaves();
		W.frequency(0);
		I.frequency(400);
		M.frequency(300);
		R.frequency(1);
		// TODO Auto-generated method stub
	}

}
