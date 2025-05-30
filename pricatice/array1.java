
// array declaration
 //int[] arr = {1,2,3,4,5};
 //String[] cities = { "pune", "mumbai", "nashik"}
 //double[] temp = {}
 //char[] vowels = {}

//arr =new int[10];



public class array1{
		public static void main(String[] args) {

			int[] marks = {6, 7, 8,9,3,5,6,7,2,4,8};

			for(int i =0; i<marks.length; i++){
				System.out.println(marks[i]);

			}

         String[] cities = { "pune", "mumbai", "nashik", "thane", "Badlapur", "shahapur"};

         for(String city:cities){
         	System.out.println(city);
         }

}
}