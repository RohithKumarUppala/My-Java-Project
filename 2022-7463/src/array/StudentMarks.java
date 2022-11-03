package array;

import java.util.Scanner;

public class StudentMarks {
	void SumOfStudents(String s[],int a[][]) {
		int sum=0,i,j;
		for(i=0;i<a.length;i++) {
			System.out.print(s[i]+"[ ");
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
			System.out.print(" ] :"+sum);
			double per = (double)sum/3;
			System.out.print(" Percentage :"+per+"\n");
			sum=0;
			}
	}
	
	public static void main(String arg[]) {
		
		StudentMarks obj = new StudentMarks();
		String name[]=new String[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Student names ");
		for(int i=0;i<name.length;i++)
			name[i]=s.nextLine();
		int marks[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter marks for "+name[i]+" :");
			for(int j=0;j<marks[i].length;j++)
				marks[i][j]=s.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.print(name[i]+" : [ ");
			for(int j=0;j<marks[i].length;j++)
				System.out.print(marks[i][j]+" ");
			System.out.print(" ]\n");
		}
		s.close();
		System.out.println("\n");
		obj.SumOfStudents(name, marks);
	}
}
