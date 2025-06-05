package in.pune;

public class ABC{

	private int a;

	public ABC(int a){
		this.a = a;
	}

	public void getA(){
        System.out.println("A value from class ABC" +a);
	}

    	// public static void main(String[] args) {

    	// 	ABC abc = new ABC(198);

    	// 	abc.getA();

    	// }

}




  //1)to comple the package


   // javac -d . ABC.java


   //2) to run 


   // java in.pune.ABC