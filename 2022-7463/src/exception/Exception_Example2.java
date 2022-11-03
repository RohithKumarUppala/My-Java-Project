package exception;
import java.util.*;
public class Exception_Example2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			String name=new String();
			System.out.println("Enter the Name");
			name=s.nextLine();
			System.out.println("Enter the Array Size");
			int n = s.nextInt();
			int arr[] =new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			System.out.println(name.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally {
			System.out.println("\n\nSize must be Integer");
			System.out.println("Display must be less then length");
			System.out.println("String Name must be Minimum 10 characters and not an integer");
			s.close();
		}
		
	}

}
