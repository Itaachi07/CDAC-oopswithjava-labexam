import java.util.Comparator;

public class Actor implements Comparable<Actor>
{
	String name;
	String gender;
	int age;
	String email_id;
	String contact;
	int rating;
	public Actor(String name, String gender, int age, String email_id, String contact, int rating) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email_id = email_id;
		String i = null;
		this.contact = i;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Actor [name=" + name + ", gender=" + gender + ", age=" + age + ", email_id=" + email_id + ", contact="
				+ contact + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Actor o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(getName());
	}
	}
	
class Age implements Comparator<Actor>{

	@Override
	public int compare(Actor o1, Actor o2) {
		// TODO Auto-generated method stub
		if (o1.getAge()==o2.getAge())
			return 0;
		if(o1.getAge()>o2.getAge())
			{return 1;
			}
		return -1;
	}
	
}

class Rating implements Comparator<Actor>{

	@Override
	public int compare(Actor o1, Actor o2) {
		// TODO Auto-generated method stub
		if (o1.getRating()==o2.getRating())
			return 0;
		if(o1.getRating()>o2.getRating())
			{return 1;
			}
		return -1;
	}
	
}







