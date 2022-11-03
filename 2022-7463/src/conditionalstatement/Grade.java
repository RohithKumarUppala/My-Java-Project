package conditionalstatement;

public class Grade{
	double totalmark;
	double couldcomputing,Cybersecurity,AI,machinelerning,softwareengineering;
	void total(double a,double b,double c,double d,double e) {
		 couldcomputing=a;
		 Cybersecurity=b;
		 AI=c;
		 machinelerning=d;
		 softwareengineering=e;
		 totalmark = couldcomputing+Cybersecurity+AI+machinelerning+softwareengineering;
		 	
		 double per = (totalmark/500)*100;
		 System.out.println("Display Percentage :"+per);
		 
		 if(per>90.0) {
			 System.out.println("Your Grade is O");
		 }
		 else if(per>80.0) {
			 System.out.println("Your Grade is A");
		 }
		 else if(per>70.0) {
			 System.out.println("Your Grade is B");
		 }
		 else if(per>60.0) {
			 System.out.println("Your Grade is C");
		 }
		 else if(per>50.0) {
			 System.out.println("Your Grade is D");
		 }
		 else if(per>40.0) {
			 System.out.println("Your Grade is E");
		 }
		 else {
			 System.out.println("Fail in Examination");
		 }
	}
	public static void main(String arg[]) {
		Grade g = new Grade();
		g.total(55.0,71.0,70.0,65.0,50.0); 
		
	}
}