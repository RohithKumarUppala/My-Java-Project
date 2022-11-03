package exception;

public class Throw {
	public void arrays(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=count;
			count++;
		}
		for(int i=0;i<=a.length;i++) {
			if(i==a.length)
				throw new ArrayIndexOutOfBoundsException("Index length must be less then "+a.length);
			System.out.print("  "+a[i]);
		}
		
	}

	public static void main(String[] args) {
		
		Throw t = new Throw();
		int a[] = new int[10];
		try {
			t.arrays(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" \nException Caught\n "+e);
		}
		System.out.println("Im in");
	}

}
