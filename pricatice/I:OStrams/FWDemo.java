import java.io.*;

public class FWDemo{

		public static void main(String[] args) throws IOException{

	      File f = new File("first.text");

	      FileWriter fw = new FileWriter(f);

	      fw.write("java is oops based language\n");

	      fw.write("Java is secure \n java is distributed and robust");

	      fw.close();


	  }
}