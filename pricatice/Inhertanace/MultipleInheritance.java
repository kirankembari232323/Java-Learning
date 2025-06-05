// multiple inheritance is not possible in java but it can be achieved through interface


interface Printable{
	void print();
}


interface Showable{
	void show();
}

public class MultipleInheritance implements Printable,Showable{

	 public void print(){
   	  	 System.out.println("it's Printing ..............."); 

     }

    public void show(){
   	  	 System.out.println("it's Showing .............."); 
    }



   	public static void main(String[] args) {

   		MultipleInheritance mi  = new MultipleInheritance();
   		mi.print();
   		mi.show();

}

}