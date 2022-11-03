package praticecode;

import java.util.Scanner;

public class ReverseWord {
	Scanner s = new Scanner(System.in);
	public void Reverseword(String str){
		if(str!=null) {
			str=str.toUpperCase();
			System.out.println("Reverse of word is :");
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}	
		}else {
			System.out.println("Enter a Valid words not null");
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Word to Reverse");
		String str = new String(s.nextLine());
		System.out.println("Enter rev to print reverse");
		if(s.hasNext("rev")) {
			ReverseWord rev = new ReverseWord();
			rev.Reverseword(str);
		}
		else
			System.out.println("\n"+str);
		s.close();
	}

}