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
	static void AcceptRecord(ArrayList<Actor>al) 
	{
		int arating=0;
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
		arating = sc.nextInt();
		if (arating<0) {
			throw new ActorUnderratedException();
		}
		if (arating >5)
		{
		 throw new ActorOverratedException();
		}
		
		}
		catch (ActorUnderratedException e){
			 arating =0;
			System.out.println("ActorUnderratedException. Actor rating is now considered as 0");
		} 
		catch (ActorOverratedException e) {
			
			  arating=5;
			System.out.println("ActorOvererratedException. Actor rating is now considered as 5");
			
		}
		a=new Actor(aname, agender, aage, acontact, acontact, aage);
	}
	
	public static void main(String[] args) {
		
		int choice= 0;
		int count =0;
		int count1 =0;
		int count2 =0;
		
		do {
			System.out.println("**************Options**************");
			System.out.println("1. Add Actor");
			System.out.println("2. Remove Actor");
			System.out.println("3. Modify Actor's rating");
			System.out.println("4. Search Actor's by name");
			System.out.println("5. Sort Actor's by Name/age/");
			System.out.println("6. Display All Actor");
			System.out.println("7.Exit");
			System.out.println("***********************************");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				AcceptRecord(al);
				al.add(a);
				for(Object obj:al)
					System.out.println(obj);
			}break;
			
			case 2:
			{
				System.out.println("Enter  the name of actor you want to remove");
				for(Object obj:al)
					System.out.println(obj);
				String an=sc.next()+""+sc.nextLine();
				for(int i=0;i<al.size();i++)
				{
				if(al.get(i).getName().equals(an))	
				{
					al.remove(i);
					count++;
					System.out.println("Actor removed");
				}
				}if(count==0)
				{
					System.out.println("Actor not Found");
				}
				for(Object obj:al)
					System.out.println(obj);
			}break;
			case 3:
			{
				System.out.println("Enter the name of actor of which rating you want to modify");
				for(Object obj:al)
					System.out.println(obj);
				String an1=sc.next();
				System.out.println("Enter rating to the modified");
				for(int i=0;i<al.size();i++)
				{
				if(al.get(i).getName().equals(an1))	
				{
					a.setRating(i);
					count1++;
					System.out.println("Rating Modified");
				}
				}if(count1==0)
				{
					System.out.println("Actor not Found");
				}
				for(Object obj:al)
					System.out.println(obj);
				
			}break;
			case 4:
			{
				System.out.println("Enter actor name");
				String an2=sc.next()+""+sc.nextLine();
				for(Actor a1:al)
				{
					if(a1.getName().equals(al))
				{
						System.out.println(a1);
						count2++;
				}
				}if (count2==0)
				{
					System.out.println("Actor not found");
				}
			}break;
			
			case 5:
			{	System.out.println("1. Sort Actor's by Name");
			System.out.println("2. Sort Actor's by age");
			System.out.println("3. Sort Actor's by rating");
			int choice1=0;
				choice =sc.nextInt();
				switch(choice1)
				{
				case 1:
				{
				Collections.sort(al);
				for(Object obj:al)
					System.out.println(obj);
				}break;
				case 2:{
					Collections.sort(al,new Age());
					for(Object obj:al)
						System.out.println(obj);
				}break;
				case 3:
				{
					Collections.sort(al,new Rating());
					for(Object obj:al)
						System.out.println(obj);
				}break;
				}
			}break;
			case 6:
			{
				for(Object obj:al)
					System.out.println(obj);
				
			}break;
			}
		}while(choice!=7);
		{
			System.out.println("Bye ");
		}
		

	}

}
