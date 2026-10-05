package asdfghjkl;

public class Demo {

	//OOPS
	// inheritance , ploymor 1) over laod / overrding
	//, encap abst
	// same name of a method with diff parameter
	// with in the class

		  void add(String s )
		  {
			  System.out.println("Sting");
		  }
		  void add(int a )
		  {
			  System.out.println("integer");
		  }
		  
		public static void main(String[] args) {
			Demo  tt = new Demo();
			tt.add("sdfasdf");
			tt.add(3);
			
		}
	}

