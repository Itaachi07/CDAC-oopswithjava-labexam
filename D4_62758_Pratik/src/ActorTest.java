import java.util.ArrayList;
import java.util.Scanner;
class ActorUnderratedException extends Exception{
	public ActorUnderratedException() {
		
	}
}
class ActorOverratedException extends Exception{
	public ActorOverratedException() {
		
	}
}

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
		try {
		System.out.println("Enter the Actor's rating");
		int arating = sc.nextInt();
		if (arating<0) {
			throw new ActorUnderratedException();
		}
		if (arating >5)
		{
		 throw new ActorOverratedException();
		}
		
		}
		catch (ActorUnderratedException e){
			int arating =0;
			System.out.println("ActorUnderratedException. Actor rating is now considered as 0");
		} catch (ActorOverratedException e) {
			// TODO Auto-generated catch block
			int arating=5;
			System.out.println("ActorOvererratedException. Actor rating is now considered as 5");
			
		}
	}
	public static void main(String[] args) {
		
		

	}

}
