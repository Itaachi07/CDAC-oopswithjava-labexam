
public class Actor implements Comparable<Actor>
{
	String name;
	String gender;
	int age;
	String email_id;
	int contact;
	double rating;
	public Actor(String name, String gender, int age, String email_id, int contact, double rating) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email_id = email_id;
		this.contact = contact;
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
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
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
		return this.rating-o.(this.rating);
	}
	
}
