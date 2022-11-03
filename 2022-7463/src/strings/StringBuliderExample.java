package strings;
import java.lang.StringBuilder;

public class StringBuliderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(10);
		
		System.out.println("Length of a StringBulider "+sb.length());
		System.out.println("Capacity of a StringBulider "+sb.capacity());
		sb.append("String Bulider ");
		System.out.println(sb);
		System.out.println("New Length of a StringBulider "+sb.length());//11
		System.out.println("New Capacity of a StringBulider "+sb.capacity());//(10+1)*2=22
		
		sb.insert(15," Class");
		System.out.println(sb);
		
		String s = "This is StringBulider";
		sb.replace(0, sb.length(), s);
		System.out.println(sb);
		
		sb.ensureCapacity(100);
		System.out.println("New Capacity of a StringBulider "+sb.capacity());
		
		String s1 = sb.substring(7);
		System.out.println("Sub String is :"+s1);
		
		System.out.println("Index value of Where : StringBulider is :"+sb.indexOf("StringBulider"));	
		
		sb.trimToSize();
		System.out.println("New Capacity of a StringBulider "+sb.capacity());
		}

}
