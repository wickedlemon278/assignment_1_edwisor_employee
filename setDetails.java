package edwisor_employee;



/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :setDetails
 *Function  :following class is used to set various characteristic details of the employee also display use of abstraction in java
 *Inheriting:inherits 'setget' class
 */



public class  setDetails extends setget{
   //For setting the name of the employee  
	public  void setEmployeeName(String givenName){
    	employeeName=givenName;
    }
	//For setting the ID of the employee
	public void setEmployeeID(String givenID){
		employeeID=givenID;
	}
	//for setting the Department of the employee
	public void setEmployeeDepartment(String givenDepartment){
		employeeDepartment = givenDepartment;
	}
	//for setting the position of the employee in the department
	public void setEmployeePosition(String givenPosition){
		employeePosition=givenPosition;
	}
	// for setting the salary of the employee
	public void setEmployeeSalary(int givenSalary){
		employeeSalary = givenSalary;
	}
	
	public String getEmployeeName() {
		//empty method to implement abstract class 'setget'
		return null;
	}

	public String getEmployeeID() {
		//empty method to implement abstract class 'setget'
		return null;
	}

	
	public String getEmployeeDepartment() {
		//empty method to implement abstract class 'setget'
		return null;
	}


	public String getEmployeeposition() {
		//empty method to implement abstract class 'setget'
		return null;
	}

	
	public double getEmployeeSalary() {
		//empty method to implement abstract class 'setget'
		return null;
	}
	
}