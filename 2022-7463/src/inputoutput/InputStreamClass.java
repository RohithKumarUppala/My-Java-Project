
package inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
//import java.net.URL;

public class InputStreamClass {

	public static void main(String[] args) throws IOException {
		
		File path = new File("Hello.txt");
		System.out.println("we go a file "+path);
		System.out.println("Does it exist "+path.exists());
		System.out.println("File Directory "+path.isDirectory());
		
		String a = "Hey world";
		OutputStream out = new FileOutputStream(path);
		out.write(a.getBytes());
		out.close();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path))); 
		String s = reader.readLine();
		reader.close();
		
		System.out.println("Read a line"+s);
		
		/*URL url =new URL("https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt");
		InputStream instream = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
		String line = reader.readLine();
		while(line!=null) {
			
			System.out.println(line);
			line=reader.readLine();
		}
		System.out.println("Done reading");*/
		
	}

}
