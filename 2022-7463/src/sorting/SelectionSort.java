package sorting;

import java.util.Scanner;

public class SelectionSort {
	void selectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) 
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		
	}
	void selection(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) { 
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}
	void display(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
	}

	public static void main(String[] args) {
		SelectionSort ele = new SelectionSort();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the Size of the Array");
			int n= s.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the Array elements");
			for(int i=0;i<arr.length;i++)
				arr[i]=s.nextInt();
			System.out.println("Before Sorting :");
			ele.display(arr);
			ele.selection(arr);
			System.out.println("After Sorting :");
			ele.display(arr);
		}
	}

}
