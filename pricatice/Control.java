
public class Control{
	
	public static void main(String[] args) {
	   int  marks = 1+(int) (Math.random()*100);
	   if(marks>=85){
	       System.out.println("Grade: A+");
	   }else if(marks>=85){
	   	   System.out.println("Grade: A");
	   }else if(marks>=60){
	   	   System.out.println("Grade: B");
	   }else if(marks>=50){
	   	   System.out.println("Grade: C");
	   }else if(marks>=40){
	   	   System.out.println("Grade: D");
	   }else{
	   	   System.out.println("Fail");
	   }
	}
}