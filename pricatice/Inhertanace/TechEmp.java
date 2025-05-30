public class TechEmp extends Emp{
  
  // can access all non priate metgohds and varibles from Emp class
	//disp()
	//setEmp()
int bonus;
    
	    public void setBonus(int bonus){
	  					  this.bonus = bonus;
			}

		
// re-defining  = method overriding
			@Override
				public void disp(){
				  super.disp();
		 		 	System.out.println(bonus);
			  }

	// re-defining  = method overriding
			@Override
			public void calcSalary(){

			 int da =42;
			 int hra=30;
			 int ta=8;

			 double salary = getBasic() + getBasic() * (da+hra+ta)/100 + bonus;
			  System.out.println("Total Salary :" + salary);

		}

	public static void main(String[] args) {

			// Emp e1 = new Emp(); //default constructor

			// e1.setEmp(145, "PQR", 2.1);
			// e1.disp();
			// e1.calcSalary();



	TechEmp t1 = new TechEmp(); //default constructor

				t1.setEmp(146, "trp", 22);
				t1.setBonus(1000);
				t1.disp();
				t1.calcSalary();


	}
}