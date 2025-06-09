import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

		List arrList = new ArrayList();

		arrList.add(new Student(123,"ABC",8.5,"pune","XYZ"));   /// here we are using the public student class
		arrList.add(new Student(123,"ABC",8.5,"pune","XYZ")); 
		arrList.add(new Student(123,"ABC",8.5,"pune","XYZ")); 
		arrList.add(new Student(123,"ABC",8.5,"pune","XYZ")); 
		arrList.add(new Student(123,"ABC",8.5,"pune","XYZ")); 

		System.out.println(arrList);

		Iterator itr = arrList.iterator();

		while(itr.hasNext()){
		    System.out.println(itr.next());

            Student s1 = (Student) itr.next();

            System.out.println(s1.id+ " "+ s1.gpa);

		}


    
    }

}