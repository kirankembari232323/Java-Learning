import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

				Map<Integer,String> m = new HashMap();
				//Map<Integer,String> m = new LinkedhashMap(); maintain insertion order

				//Map<Integer,String> m = new Treemap(); // ascending order based on the keys
 
				m.put(124,"qwe");
				m.put(125,"asd");
				m.put(126,"gds");
				m.put(127,"sdf");
				m.put(128,"vxc");

				System.out.println(m); 

			    Collection c1 = m.keySet();
			    System.out.println(c1); 

			      Collection c2 = m.values();
			    System.out.println(c2); 
   

             Set s = m.entrySet();
             Iterator itr = s.iterator();

             while(itr.hasNext()){
             	Map.Entry me = (Map.Entry) itr.next();
      	 	  System.out.println(me.getKey() +" "+ me.getValue());

      	 }






	}


}