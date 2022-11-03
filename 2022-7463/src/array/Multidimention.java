package array;

import java.util.Scanner;

public class Multidimention {
	void SumOfRow(int a[][]) {
		int sum=0,i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
			System.out.print(" :"+sum+"\n");
			sum=0;
			}
	}
	void SumOfCol(int a[][]) {
		int sum=0,i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[j][i]+" ");
				sum+=a[j][i];
			}
			System.out.print(" :"+sum+"\n");
			sum=0;
			}
	}

	public static void main(String[] args) {
		
		Multidimention obj = new Multidimention();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row Size of the Array");
		int m=s.nextInt();
		System.out.println("Enter the column Size of the Array");
		int n=s.nextInt();
		int [][]arr = new int [m][n];
		System.out.println("Enter the Elements");
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=s.nextInt();				
				}
		}
			
		s.close();
		obj.SumOfRow(arr);
		System.out.println("\n");
		obj.SumOfCol(arr);

	}

}
