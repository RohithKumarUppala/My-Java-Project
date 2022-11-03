package sorting;

import java.util.Scanner;

public class InsertionSort {
	void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0 && a[j]>k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
	}
	void display(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
	}
	public static void main(String[] args) {
		
		InsertionSort I =new InsertionSort();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the Size of the Array");
			int n= s.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the Array elements");
			for(int i=0;i<arr.length;i++)
				arr[i]=s.nextInt();
			System.out.println("Before Sorting :");
			I.display(arr);
			I.insertionSort(arr);;
			System.out.println("After Sorting :");
			I.display(arr);
		}
	}

}
