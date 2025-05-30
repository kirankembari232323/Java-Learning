import java.util.Scanner;
import java.util.Arrays;

public class Array2{
	
			public static void main(String[] args) {

				Scanner In = new Scanner(System.in);

				int [] arr = new int[5];
				int sum = 0;

				//populating array
				System.out.println("Enter " + arr.length+ " element");

				for(int i= 0; i <arr.length; i++){

					arr[i] = In.nextInt();
					sum += arr[i];
				}

				//Printing sum and averages

				System.out.println("SUm of elements " +sum);

				System.out.println("avg of elements " +sum/arr.length);


				// Min & Max

				int min = arr[0];
				int max = arr[0];

				for(int i= 0; i <arr.length; i++){

                  if(arr[i]<min){
                  	min = arr[i];
                  }

                  if(arr[i]>max){
                  	max = arr[i];
                  }
			}
							System.out.println("min: " +min+ " Max: "+max);


}
}