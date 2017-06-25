package edwisor_employee;


/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :setget
 *Function  :following class is used to define various methods for the program to set and get the details of the employee inputed by user, also providing encapsulation & display use of abstraction in java 
 *Inheriting:inherits 'employee' class
 */



public abstract class setget extends employee {
    public abstract void setEmployeeName(String givenName);
	
	public abstract void setEmployeeID(String givenID);
	
	public abstract void setEmployeeDepartment(String givenDepartment);
	
	public abstract void setEmployeePosition(String givenPosition);
	
	public abstract void setEmployeeSalary(int givenSalary);
	
	public abstract String getEmployeeName();
	
	public abstract String getEmployeeID();
	
	public abstract String getEmployeeDepartment();
	
	public abstract String getEmployeeposition ();
	
	public abstract double getEmployeeSalary();
}
