package inheritance;

import java.util.Scanner;

class Zoom{
	int meet_id;
	String meetingName;
	void setDetailsZoom(int meet_id,String meetingName){
		this.meet_id=meet_id;
		this.meetingName=meetingName;
	}
	void viewOptions() {
		System.out.println("Share Screen\nAudio and Video\nSubscrption Need for more the 100 people joined"
				+ "\nAnimation Video");
	}
}
class Googlemeet extends Zoom{
	
	int meet_id;
	String meetingName;
	void setDetailsGoogle(int meet_id,String meetingName){
		this.meet_id=meet_id;
		this.meetingName=meetingName;
	}
	void display() {
		System.out.println("meeting id is "+meet_id+ " and Meeting name "+meetingName);
		System.out.println("meeting id is "+super.meet_id+ " and Meeting name "+super.meetingName);
	}
	void viewOptions() {
		System.out.println("\nZoom options\n");
		super.viewOptions();
		System.out.println("\n\nGoogle options");
		System.out.println("\nShare Screen\nAudio and Video\n500 people can join"
				+ "\nAnimation Video\ngoogle sign\ngoogle Security ");
	}
	
}

public class Super_Ex {

	public static void main(String[] args) {
		
		Googlemeet idr = new Googlemeet();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Zoom meeting name and id");
		String Z_Name=s.nextLine();
		int Z_id=s.nextInt();
		idr.setDetailsZoom(Z_id, Z_Name);
		s.nextLine();
		System.out.println("Enter the google meeting Name ang id");
		String G_Name=s.nextLine();
		int G_id=s.nextInt();
		idr.setDetailsGoogle(G_id, G_Name);
		s.nextLine();
		s.close();
		idr.display();
		System.out.println("Enter Yes to View Option Meetings Apps ");
		if(s.nextLine().equals("yes")) {
			idr.viewOptions();
		}else
			System.out.println("\n\nThank you ");
		
		System.out.println("\n\nThank you ");
	}

}
