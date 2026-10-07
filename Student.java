package asdfghjkl;

public class Student 
{
	String name;
	int age;
	
	void introduce()
	{
		System.out.println(" I am " + name +", age " + age);
	}
	public static void main(String[] args) {


Student s= new Student();
s.name = "Rohith"; 
s.age = 19;
s.introduce();

	}
}