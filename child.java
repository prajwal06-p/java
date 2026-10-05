package asdfghjkl;
//OOPS
//inheritance , ploymor 1) over laod / overrding
//, encap abst
//same name of a method with diff parameter
//with in the class

class Parent
{
	void cancer()
	{
		System.out.println("I am having cancer");
	}
}

public class child extends Parent {	   
	public static void main(String[] args) {
		child  tt = new child();
		tt.cancer();
		
	}
}