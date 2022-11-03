package java_package;
class Animals{
	void running() {
		System.out.println("Starts Running");
	}
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
class Dog extends Animals{
	void sound() {
		System.out.println("Dog Sound like bow bow");
	}
}
class Cat extends Animals{
	void sound() {
		System.out.println("Cat Sound like Meow Meow");
	}
}
public class ExampleHierarchical{

	public static void main(String[] args) {
		Dog rocky = new Dog();
		Cat belli= new Cat();
		rocky.running();
		rocky.sound();
		belli.running();
		belli.sound();
		belli.sleep();
	}

}
