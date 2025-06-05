package in; // to import custom package it should be in same package
import in.pune.*;
import in.hyd.*;


public class Driver{

		public static void main(String[] args) {

    	 	ABC abc = new ABC(198);

    	 	abc.getA();

    	    XYZ xyz = new XYZ(138);

    	    xyz.getX();

    	 }

}


  //1)to comple the package


   // javac -d . Driver.java


   //2) to run 


   //   java in.Driver