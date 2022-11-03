package array;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size ");
		int size = s.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
			a[i]=++count;

		int j=0;
		for(int i=0;i<10;i++) {
			if(a[i]%2==0) {
				int temp = a[i];
				a[i]=a[j];
				a[j]= temp;
				j++;
			}
		}
		for(int i :a)
			System.out.print(i+ " ");
		s.close();
	}

}
