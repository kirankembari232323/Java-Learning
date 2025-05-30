

public class Method{

	            static void add( int... x){
                	int s =0 ;
                	for(int i=0; i<x.length; i++){
                		s += x[i];
                	System.out.println("sum is " +s);
                	}
                }
	
			public static void main(String... args) {

            add(10,20);
            add(10,20,30);
            add(10,20,30,40);
            add(10,20,30,40,50);

			}

		}