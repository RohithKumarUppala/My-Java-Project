package polymorpism;

class DiffParaOverloading{
	public void dis(int num) {
		System.out.println("A value :"+num);
	}
	public void dis(char a) {
		System.out.println(a+" value");
	}
}

public class Overloading{

	public static void main(String[] args) {
		DiffParaOverloading E = new DiffParaOverloading();
		E.dis(55);
		E.dis('A');
		}// TODO Auto-generated method stub
}
