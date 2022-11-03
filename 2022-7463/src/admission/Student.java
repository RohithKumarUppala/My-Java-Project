package admission;

public class Student {
		private String name=null;;
		private long mobilenumber=0;
		private float degree_per=0;
		
		public void setName(String n)
		{
			name=n;
			return;
		}
		public void setMobilenumber(long n) {
			mobilenumber=n;
			return;
		}
		public void setDegree_per(float n) {
			degree_per=n;
		}
		public String getName(){
			return name;
		}
		public long getMobilenumber(){
			return mobilenumber;
		}
		public float getDegree_per(){
			return degree_per;
		}
		public void eligible(String name,float n) {
			if(n>=75.0) {
				System.out.println(name+" your eligible for application ");
			}
			else
				System.out.println(name+" your not eligible for application ");		
		}

}


