
import java.io.Serializable;
public class Person implements Serializable{

	private String name;
	private int age;
	private long adhar;


	public Person(String name, int age, long adhar){

		this.name = name;
		this.age = age;
		this.adhar = adhar;
	}


	@Override
	public String toString(){
       return "[ Student :- Name:" +name+ " Age:" +age+ " Adhar:"+ adhar+" ]";
	}
}