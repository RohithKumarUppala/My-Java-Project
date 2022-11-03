package exception;

public class Exception_NullPointer {
	 void exception_null(){
		
		try {
			String Name="";
			if(Name=="hello")
				System.out.println("your applicable foe voter");
			else
				System.out.println("your not applicable foe voter");
		}catch(NullPointerException e) {
			System.out.println("Age is in vaild");
		}

	}

	public static void main(String[] args) {
		
		Exception_NullPointer nu = new Exception_NullPointer();
		nu.exception_null();
	}

};
