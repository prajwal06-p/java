package asdfghjkl;

		class Parent1 {
			private int a;
			public int getA() {
				return a;
			}
			public void setA(int a) {
				this.a = a;
			}
		}

		class p12 extends Parent1 {

			public static void main(String[] args) {
				p12 bb = new p12();
				bb.setA(7);
				int ss = bb.getA();
				System.out.println(ss);
			}

		}	



