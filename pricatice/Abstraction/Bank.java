public class Bank extends ATM{

	int cashback;


	public Bank( double intRate, int cashback){
		super(intRate);
		this.cashback = cashback;
	}

    // abstract method needs to be implement here once we extends that class
	 void witdraw(){
	 	    System.out.println("withdraw success"); 
	 	    System.out.println("congrats .... you got a cashback"+cashback); 
	 };

	 void deposit(){
	 	    System.out.println("Deposit success");
	 	   System.out.println("congrats .... you got a intRate"+intRate); 

	 };

	 @Override
    void disp(){
    	System.out.println("I am Bank"); 
    }

    void fun(){
    	System.out.println("fun"); 
    }

    	public static void main(String[] args) {

    		ATM a1 = new Bank(8.5, 30);  //upcasting
    		a1.disp();
    		a1.witdraw();
    		a1.deposit();
    		//a1.fun()  this will give error  you cannot call the child specific method with parent refrence

    		Bank b1 = new Bank(8.5,30); // to call child we can create an object
    		b1.fun();

    }
}