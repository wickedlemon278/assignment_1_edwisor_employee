package edwisor_employee;


/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :getDetails
 *Function  :following class is used to get various characteristic details of the employee and store it in the various desired variables also display use of abstraction in java
 *Inheriting:inherits 'setget' class
 */



public  class  getDetails extends setget{
    
	public  void setEmployeeName(String givenName){
    	//empty method to implement abstract class 'setget'
    }
	
	public void setEmployeeID(String givenID){
		//empty method to implement abstract class 'setget'
	}
	
	public void setEmployeeDepartment(String givenDepartment){
		//empty method to implement abstract class 'setget'
	}
	
	public void setEmployeePosition(String givenPosition){
		//empty method to implement abstract class 'setget'
	}
	
	public void setEmployeeSalary(int givenSalary){
		//empty method to implement abstract class 'setget'
	}

	// for getting the set name of the employee
	public String getEmployeeName() {
		return employeeName;
	}

	// for getting the set id of the employee
	public String getEmployeeID() {
		return employeeID;
	}

	//for getting the set department of the employee
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
    
	//for getting the set position of the employee
	public String getEmployeeposition() {
		return employeePosition;
	}

	//for getting the set salary of the employee
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
}