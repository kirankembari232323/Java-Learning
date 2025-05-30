class Student{
	private int sid; //instance - object - heap
	private String sname;
	private double gpa;
	private static String university ="Stanford";
	private String city;

//Default constructor
public Student(){
		
	}

   //methods - setters & gettters // parameterized constructor  => no need to used setters
	public Student(int sid, String sname, double gpa){
		this.sid =sid;
		this.sname = sname;
		this.gpa =gpa;
	}

	public Student(int sid, String sname, double gpa, String city){
		this(sid,sname,gpa);
		this.city =city;
	}


    void getStudent(){

    	System.out.println(sid+ " "+sname+" "+gpa+ " "+city+ " "+university);

    }

 // static method to change the value of static variable
    public static void change(){ 
    	university = "IIT Bombay";
    }

    public static void main(String[] args) {

    	Student s1 = new Student(10, "akshay",8.2); // old object
    	s1.getStudent(); 

    	Student s2 = new Student();
    	s2.getStudent(); 

        change();
    		Student s3 = new Student(11, "Raj", 9.2, "Pune");
    	s3.getStudent(); 
    }

}

// constructor

// constructor used to initalise an object
// invoke at the time of object creation
// same name as class
// class has no contructor then defualt is used

// this

//this keyword refres to the current object
// refers to current class constructor


// if all the variables are private then it is fully encapuslated class. we cannot access it outside the class.

