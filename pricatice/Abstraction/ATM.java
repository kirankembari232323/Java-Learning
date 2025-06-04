abstract class ATM{

	 double intRate;

	 public ATM(double intRate){
	 	this.intRate = intRate;
	 }

    // abstract method
	abstract void witdraw();
	abstract void deposit();

    // concrete method
    void disp(){
    	System.out.println("I am ATM"); 
    }

}