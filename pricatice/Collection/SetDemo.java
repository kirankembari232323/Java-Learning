import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> s = new TreeSet();

		s.add("PQR");
		s.add("ABC");
		s.add("sds");
		s.add("sdsdsdsd");
		s.add("xcvcv");
		s.add("ertr");

			 System.out.println(s); 

		  Iterator itr = s.iterator();

      	 while(itr.hasNext()){
      	 	System.out.println(itr.next());

      	 }




	}

}
    