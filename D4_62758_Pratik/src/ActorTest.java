import java.util.ArrayList;
import java.util.Scanner;

public class ActorTest {
	
	static Scanner sc = new Scanner(System.in);
	ArrayList<Actor>al= new ArrayList<Actor>();
	static Actor a =null;
	public static void AcceptRecord(ArrayList<Actor>a) 
	{
		System.out.println("Enter the Actor's name");
		String aname= sc.next()+""+sc.nextLine();
		System.out.println("Enter the Actor's Gender");
		String agender= sc.next();
		System.out.println("Enter the Actor's age");
		int aage = sc.nextInt();
		System.out.println("Enter the Actor's Email ID");
		String aemailid= sc.next();
		System.out.println("Enter the Actor's Contact");
		int acontact= sc.nextInt();
		System.out.println("Enter the Actor's rating");
		int arating = sc.nextInt();
	}
	public static void main(String[] args) {
		
		

	}

}
