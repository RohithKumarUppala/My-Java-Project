package inputoutput;
import java.io.*;
import java.util.Scanner;

public class FileDemoCopy {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		try(Scanner s =new Scanner(System.in)){
		System.out.println("Enter the Adress to store Data");
		String src = s.nextLine();
		System.out.println("Enter the Data you want to Write");
		String data = s.nextLine();
		OutputStream out = new FileOutputStream(src);
		out.write(data.getBytes());
		InputStream in = new FileInputStream(src);
		/*int re = in.read();
		while(re!=-1) {
			char r = (char)re;
			System.out.print(r);
			re = in.read();
			}
		in.close();*/
		System.out.println("\nEnter the Adress to copy the Data");
		String co = s.nextLine();
		try(OutputStream copy = new FileOutputStream(co)){
		int c = in.read();
		while(c!=-1) {
			copy.write(c);
			c = in.read();
			}
		}
		System.out.println("Success fully copied data ");
		out.close();
		in.close();
		}

	}

}
