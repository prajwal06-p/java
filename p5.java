package asdfghjkl;


	abstract class Atm {
		 abstract void withdraw();
		 abstract void deposite();
		}
		public class p5 extends Atm {
		  void withdraw()
		  {
			  System.out.println("withdraw");
		  }
		  void deposite()
		  {
			  System.out.println("deposite");
		  }
			public static void main(String[] args) {
				p5 ff = new p5();
				ff.withdraw();
				ff.deposite();
			}
		}


