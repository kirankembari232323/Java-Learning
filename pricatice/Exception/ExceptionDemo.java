import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionDemo{

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		System.out.println("Enter a two digit");
        
        int a=0; 
        int b = 0;

        try{

			a = in.nextInt();
	 
			b = in.nextInt();

	        int res = a/b; //throw new java.lang.ArithmeticException()

			System.out.println("Result = " + res);

        }
         catch( ArithmeticException e){

        	System.err.println(e);
        } 
        catch( InputMismatchException e){

        	System.err.println(e);
        } 



		int sum = a+b;

		System.out.println("Sum = " + sum);
		

		int product = a*b;

		System.out.println("Product = " + product);

		System.out.println("Rest of the code follows ");


}
}