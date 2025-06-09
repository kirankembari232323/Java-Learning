import java.io.*;

public class SerializeTest{

			public static void main(String[] args) throws Exception{

				Person p1 = new Person("ASDF",21,783836445232L);

				System.out.println(p1);

				//serialization

				FileOutputStream fos = new FileOutputStream("person.info");
                
               ObjectOutputStream oos = new ObjectOutputStream(fos);

               oos.writeObject(p1);


               //de-serialization

               FileInputStream fis = new FileInputStream("person.info");
                
               ObjectInputStream ois = new ObjectInputStream(fis);

               Person p2 = (Person) ois.readObject();

               
              System.out.println(p2);



			}

}


//Serialization

// process of writing state of an object to byte stream

// FileOutputStream  - to point to byte stream file

// ObjectOutputStream - to write object


//De-serialization

// FileInputStream -  to point to byte stream file

// ObjectInputStream - to read object