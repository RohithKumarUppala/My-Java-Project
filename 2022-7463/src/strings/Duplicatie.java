package strings;
//import java.lang.StringBuilder;
public class Duplicatie {

	public static void main(String[] args) {
		String s = new String("Full stack java");
		//System.out.print(s.length());
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)&&s.charAt(i)!=' ') {
					count++;
					
				}
			}
			if(count>1&&s.charAt(i)!=' ') {
				System.out.println(s.charAt(i)+" is Dupilcated "+count+" Times");
				
				String d=String.valueOf(s.charAt(i)).trim();
				System.out.println(d);
				
				s=s.replaceAll(d,"");
				System.out.println(s);
			}
		}
	}

}
