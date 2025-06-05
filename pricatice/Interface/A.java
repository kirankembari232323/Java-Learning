public class A implements Printable{
   

   public void print(){
   	  	 System.out.println("Print success"); 

   }

    public void show(){
   	  	 System.out.println("show success"); 

   }


       	public static void main(String[] args) {

       		Printable p  = new A();
       		p.print();
       		p.show();


}

}