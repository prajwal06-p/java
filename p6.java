package asdfghjkl;


	abstract class Atm {
		 abstract void withdraw();
		}
		 abstract class Atm1 extends Atm {
			 abstract void deposite();
		 }

		 public class p6 extends Atm1{
			  void withdraw()
			  {
				  System.out.println("withdraw");
			  }
			  void deposite()
			  {
				  System.out.println("deposite");
			  }
				public static void main(String[] args) {
					p6 ff = new p6();
					ff.withdraw();
					ff.deposite();
				}
			}


