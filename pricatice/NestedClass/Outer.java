// class can be defined in the another class 
// these classes are called nested classes

// to instatiate an inner class you must first instatiate the outer class

public class Outer{

	private int data = 99;

	class Inner{
		void msg(){
         	  	 System.out.println("data for a outer class is " +data);
         	  	}
	}

void disp(){
         	  	 System.out.println("outer class method");
         	  	}


	   	public static void main(String[] args) {

	   		Outer out = new Outer(); // outer object

	   		Outer.Inner in = out. new Inner();
            
            in.msg();

            out.disp();

	   	}

}