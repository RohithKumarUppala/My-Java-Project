package exception;

import java.util.*;

public class Multi_Catch_Block {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the array elements from last index");
			for(int i=arr.length;i>=0;i--) {
				arr[i]=s.nextInt();
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Starting From Out of Length :"+e);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid element :Element must be an Integer\n"+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Out of all the Exception");
		}
		s.close();
	}

}
