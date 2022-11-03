package array;

import java.util.Scanner;

public class SumOfMutidimension {
	int sum(int a[][]) {
		int sum=0,i,j;
		for(i=0;i<a.length;i++)
				for(j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+"+");
					sum+=a[i][j];
				}
		return sum;
	}

	public static void main(String[] args) {
		
		SumOfMutidimension obj = new SumOfMutidimension();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row Size of the Array");
		int m=s.nextInt();
		System.out.println("Enter the column Size of the Array");
		int n=s.nextInt();
		int [][]arr = new int [m][n];
		System.out.println("Enter the Elements");
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=s.nextInt();				}
		}
			
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");				
			}
			System.out.println();
			}
		s.close();
		System.out.println("\nSum of an Array elements  :"+obj.sum(arr));
	}

}	/*for(int i=0;i<m;i++) {
for(int j=0;j<arr[i].length;j++) {
System.out.print(arr[i][j]+ " ");				
}
System.out.println();
}*/
