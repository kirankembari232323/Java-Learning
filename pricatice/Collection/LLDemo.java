

import java.util.*;

public class LLDemo {

	public static void main(String[] args) {

		List<String> ll = new LinkedList();

		ll.add("Thane");
		ll.add("Pune");
		ll.add("Mumbai");
		ll.add("Nashik");
		ll.add("Satara");
		ll.add("Goa");

		System.out.println(ll);

		ListIterator<String>  itr = ll.listIterator();

		while(itr.hasNext()){

			String str = itr.next();

			if(str.equals("Satara"))
				itr.remove();
			if(str.equalsIgnoreCase("Goa"))
				itr.add("Badlapur");

		}

				System.out.println(ll);


	}

}