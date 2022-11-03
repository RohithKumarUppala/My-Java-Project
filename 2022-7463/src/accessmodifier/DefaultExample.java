package accessmodifier;

class Default{
	int data;
	String observervation;
	void method() {
		System.out.println("Defalut.. Method");
	}
}

public class DefaultExample {

	public static void main(String[] args) {
		Default D = new Default();
		D.data=101;
		D.observervation="Datatype is Default";
		System.out.println("Data is :-"+D.data+". Obsevation is "+D.observervation);
		D.method();//Default can Access at outside the class within the package
		// TODO Auto-generated method stub
	}
}
