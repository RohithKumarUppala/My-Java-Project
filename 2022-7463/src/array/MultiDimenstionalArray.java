package array;

import java.util.Scanner;

public class MultiDimenstionalArray {
	void display(int a[][],int i,int j) {
		System.out.println(a[i][j]);	
	}

	public static void main(String[] args) {
		
		MultiDimenstionalArray MD = new MultiDimenstionalArray();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row Size of the Array");
		int m=s.nextInt();
		System.out.println("Enter the column Size of the Array");
		int n=s.nextInt();
		int [][]matrix = new int [m][n];
		System.out.println("Enter the Elements");
		for(int i=0;i<m;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=s.nextInt();				}
		}
			
		for(int i=0;i<m;i++) {
			System.out.print("[");
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(" "+matrix[i][j]+ " ");				
			}
			System.out.print("]\n");
			}
		s.close();
		MD.display(matrix, 2, 2);
	}
}


