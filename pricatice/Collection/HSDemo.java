import java.util.*;

public class HSDemo {

	public static void main(String[] args) {

		Set s = new LinkedHashSet();

		s.add(123);
		s.add("ABC");
		s.add(23);
		s.add(false);
		s.add(null);
		s.add(99);

		 System.out.println(s); 

		  Iterator itr = s.iterator();

      	 while(itr.hasNext()){
      	 	System.out.println(itr.next());

      	 }




	}

}
    