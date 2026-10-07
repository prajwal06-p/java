 package atm;

	class Parent1 {
	    void marry() {
	        System.out.println("Selected by family");
	    }

	    void property() {
	        System.out.println("Property of family");
	    }
	}

	class Parent extends Parent1 {

	    @Override
	    void marry() {
	        System.out.println("Campus selected");
	    }

	    public static void main(String[] args) {
	        Parent bb = new Parent();

	        bb.marry();
	        bb.property();
	    }
	}


