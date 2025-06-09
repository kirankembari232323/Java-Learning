import java.io.*;

public class FRDemo{

		public static void main(String[] args) throws Exception{


	      FileReader fr = new FileReader("first.text");


	      int x;

	      while((x = fr.read())!= -1){

	      	 System.out.print((char)x);
	      }

	      fr.close();


	  }
}