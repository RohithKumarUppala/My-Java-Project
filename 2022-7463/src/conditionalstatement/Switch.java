package conditionalstatement;
import java.util.Scanner;
class Selection{
	public void apply() {
		
			try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter your Age :");
			int age = s.nextInt();
			if(age>=21&&age<50) {
				
				System.out.println("Enter Your Qualification :");
				String course = s.next();
				if(course.equals("mca")||course.equals("msc")) {
					System.out.println(course+" is Applicable for Registration");
				}
				else if(course.equals("bsc")) {
					System.out.println(course+" under Waiting list");
				}
			}
			else {
				System.out.println("not applicable");
			}
		}
		}
		public void preview() {
			
			System.out.println("Application For JOB Software Development");
		}
		public void avaliable() {
			System.out.println("Total Number of vacancys is 200");
		}
		public void exit() {
			System.out.println("thank you for your time");
		}
}
public class Switch {

	public static void main(String[] args) {
		
		Selection SE = new Selection();
		System.out.println("Enter any one \n1.apply()\n2.preview\n3.vacancy\n4.exit");
		try(Scanner a = new Scanner(System.in)){
		int s = a.nextInt();
		switch(s) {
			case 1: SE.apply();
					break;
			case 2: SE.preview();
					break;
			case 3: SE.avaliable();
					break;
			case 4: SE.exit();
					break;
			default: System.out.println("Invalid Enter");	
				}
			}
	}
}