import java.util.ArrayList;
import java.util.Collections;
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
	static ArrayList<Actor>al= new ArrayList<Actor>();
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
		String acontact= sc.next();
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
		} 
		catch (ActorOverratedException e) {
			// TODO Auto-generated catch block
			int arating=5;
			System.out.println("ActorOvererratedException. Actor rating is now considered as 5");
			
		}
	}
	//Actor a= new Actor(aname, agender, aage, aemailid, acontact, arating);
	public static void main(String[] args) {
		//al.add(new Actor("Amir","male",28,"amir@gmail.com",9421135877,4));
		int choice= 0;
		int count =0;
		
		do {
			System.out.println("**************Options**************");
			System.out.println("1. Add Actor");
			System.out.println("2. Remove Actor");
			System.out.println("3. Modify Actor's rating");
			System.out.println("4. Search Actor's by name");
			System.out.println("5. Sort Actor's by name");
			System.out.println("6. Display All Actor");
			System.out.println("***********************************");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				AcceptRecord(al);
				for(Object obj:al)
					System.out.println(obj);
			}break;
			
			case 2:
			{
				System.out.println();
				
			}break;
			case 3:
			{
				
			}break;
			case 4:
			{
				
			}break;
			case 5:
			{
				Collections.sort(al);
				for(Object obj:al)
					System.out.println(obj);
				
			}break;
			case 6:
			{
				for(Object obj:al)
					System.out.println(obj);
				
			}break;
			}
		}while(choice!=7);
		

	}

}
