package conditionalstatement;

public class EvenorOdd{
	
    public void Evenorodd(long a){
    	if(a%2==0)
    		System.out.println("Given Number : "+a+" is an Even Number");
    	else
    		System.out.println("Given Number : "+a+" is an Odd Number");
    		
    }
	public static void main(String[] args) {
		
		EvenorOdd n = new EvenorOdd();
		n.Evenorodd(651547);
	}

}
