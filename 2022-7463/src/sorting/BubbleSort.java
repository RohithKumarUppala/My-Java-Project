package sorting;

import java.util.Scanner;

public class BubbleSort {
	void bubbleSort(int[] a) {
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
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
		BubbleSort B = new BubbleSort();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the Size of the Array");
			int n= s.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the Array elements");
			for(int i=0;i<arr.length;i++)
				arr[i]=s.nextInt();
			System.out.println("Before Sorting :");
			B.display(arr);
			B.bubbleSort(arr);;
			System.out.println("After Sorting :");
			B.display(arr);
		}

	}

}
