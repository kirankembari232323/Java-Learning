public class SBI implements RBI{




    // abstract method needs to be implement here once we extends that class
	 public void withdraw(){
	 	    System.out.println("withdraw success"); 
	 };

	 public void deposit(){
	 	    System.out.println("Deposit success & you got a intRate "+intRate);
	 };

	  public void transfer(){
	 	    System.out.println("transfer success");
	 };

    void disp(){
    	System.out.println("I am Bank"); 
    }

    void fun(){
    	System.out.println("fun"); 
    }

    	public static void main(String[] args) {

    		RBI r1 = new SBI();  //upcasting
    		r1.withdraw();
    		r1.deposit();
    		r1.transfer();

    		//r1.disp()  this will give error  you cannot call the child specific method with parent refrence

    		SBI s1 = new SBI(); // to call child we can create an object
    		s1.disp();

    }
}