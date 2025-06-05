package in.hyd;

public class XYZ{

	private int x;

	public XYZ(int x){
		this.x = x;
	}

	public void getX(){
        System.out.println("x value from class XYZ" +x);
	}

    	// public static void main(String[] args) {

    	// 	XYZ xyz = new XYZ(198);

    	// 	xyz.getX();

    	// }

}




  //1)to comple the package


   // javac -d . XYZ.java


   //2) to run 


   // java in.hyd.XYZ