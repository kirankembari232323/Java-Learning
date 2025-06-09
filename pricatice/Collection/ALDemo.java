import java.util.*;

public class ALDemo {

	public static void main(String[] args) {
    

      ArrayList al = new ArrayList();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add("java");
      al.add(true);
      al.add(3.14);
      al.add(10);

     System.out.println(al); // 6

      List<Integer> al2 = new ArrayList();

      al2.add(50);
      al2.add(60);
      al2.add(70);
      al2.add(80);

      al.addAll(al2);

      System.out.println(al);
      System.out.println(al.size());

      al.remove(2);

      System.out.println(al);

      //Normal for loop

      for(Object obj:al)
      	      System.out.println(obj);

      	        System.out.println("****************************");


      //Using iterator - you can do many more things like remove etc

      	 Iterator itr = al.iterator();

      	 while(itr.hasNext()){
      	 	System.out.println(itr.next());

      	 }




	}
}