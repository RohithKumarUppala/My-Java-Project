package inputoutput;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of empolyes");
		int n=s.nextInt();
		s.nextLine();
		String name[] = new String[n];
		String pos[] = new String[n];
		long num[] = new long[n];
		char gen[] = new char[n];
		int sal[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name for "+i+" :");
			name[i] = s.nextLine();
			System.out.println("Enter the position for "+i+ " :");
			pos[i] = s.nextLine();
		    System.out.println("Enter the mobile number for "+i+ " :");
			num[i]=s.nextLong();
			System.out.println("Enter the Gender for "+i+ " :");
			gen[i]=s.next().charAt(0);
			System.out.println("Enter the Salary for "+i+ " :");
			sal[i]=s.nextInt();
		}
		System.out.println(" Name    position     number    gender  Salary");
		for(int i=0;i<n;i++) {
			System.out.print(name[i]+"  "+pos[i]+ "        "+num[i]+ "    "+gen[i]+ "   "+sal[i]);
		}
		s.close();
	}

}
