package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int i,j;
		Scanner s = new Scanner(System.in);
		int jag[][] = new int[5][];
		jag[0] = new int[5];
		jag[1] = new int[4];
		jag[2] = new int[3];
		jag[3] = new int[2];
		jag[4] = new int[1];
		System.out.println("Enter the elements :");
		for(i=0;i<jag.length;i++) {
			for(j=0;j<jag[i].length;j++){
				jag[i][j]=s.nextInt();
			}
		}
		for(i=0;i<jag.length;i++) {
			for(j=0;j<jag[i].length;j++) {
				System.out.print(jag[i][j]+"   ");
				}
			System.out.println();
		}
	}
}


