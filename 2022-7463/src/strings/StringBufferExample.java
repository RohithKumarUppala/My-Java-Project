package strings;
import java.lang.StringBuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		
		String s = "This is an String Buffer class";
		StringBuffer topic = new StringBuffer(s);
		int len = topic.length();//length
		System.out.println("length is :"+len);
		int cap = topic.capacity();//Capacity
		System.out.println("capacity is :"+cap);
		topic.append(" And Appended here ");
		System.out.println(topic); //Adding the Elements
		topic.insert(30, " Inserted");// Inserted at particular Place
		System.out.println(topic);
		StringBuffer rev = topic.reverse();// Reverse of an String
		System.out.println(rev);
		topic.reverse();
		topic.delete(0,4); // Delete at particular index
		System.out.println(topic);
		topic.replace(4, 6, " a"); // replacing an with a
		System.out.println(topic);
		
		int unicode = topic.codePointAt(8);
		System.out.println("Unicode of an Index 8 :"+unicode);
		
		unicode = topic.codePointBefore(9);
		System.out.println("Unicode of an Index 9 Before :"+unicode);
		
		unicode = topic.codePointCount(0, 3);
		System.out.println("Unicode of between 0 to 3 index  :"+unicode);

	}

}
