package edwisor_employee;

import java.util.Scanner;


/*Author    :Kunwar Deepak
 *Dated     :24-06-17  
 *Class     :employee
 *Function  :main class containing main() method and provides the right flow to the program .
 */

public class employee {
	public static String employeeName;			// stores the name of the employee
	public static String employeeID;            // stores the ID of the employee
	public static String employeeDepartment;    // stores the department of the employee
	public static String employeePosition;      // stores the position of the employee
	public static int employeeSalary;           // stores the salary of the employee
	
	static String str1 = "s";                   // a reference variable to check the input
	
/////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
	
	
	
	public static void intro(){   // introductory method intro() which also provides help for recursiveness in program 
		 System.out.println("***********  Welcome To Employee Detail System *********");
			
			coreFunction();
	 }
	
/////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
	
	 public static void coreFunction(){     //  which controls the flow of program , also getting input and storing the deatils of the employee & making decision based on the input 
		 System.out.println("Select the working mode:");
		 System.out.println("1) Press 's' (set)for setting details of the employee \n2) Press 'e' (exit) to exit programm");
		 setDetails set = new setDetails() ;  // objects for setdetails and getdetails methods 
		 getDetails get = new getDetails();
			Scanner inputCommand  = new Scanner (System.in);  // object for input
			String input = inputCommand.nextLine();
			int compareResult = input.compareTo(str1);
			if (compareResult == 0){ //......................comparison of input to decide the desired mode of the user
				System.out.println(" INPUT COMMAND : 'S' ");
				System.out.println("Enterring SET Command Mode........... ");
				System.out.println("Enter the Name of the employee :");
				String inputName = inputCommand.nextLine();
				set.setEmployeeName(inputName);                  // getting input the details of the employee
				System.out.println("Enter the Emplyoee ID of the employee :");
				String inputID = inputCommand.nextLine();
				set.setEmployeeID(inputID);                     // getting input the details of the employee
				System.out.println("Enter the Department of the employee");
				String inputDepartment = inputCommand.nextLine();
				set.setEmployeeDepartment(inputDepartment);	    // getting input the details of the employee
				System.out.println("Enter the Position of the employee");
				String inputPosition = inputCommand.nextLine();
				set.setEmployeePosition(inputPosition);	       // getting input the details of the employee
				System.out.println("Enter the Salary of the employee");
				int inputSalary = inputCommand.nextInt();
				set.setEmployeeSalary(inputSalary);           // getting input the details of the employee
				String vacant= inputCommand.nextLine();       // a vacant input provide smooth operation !!! note: if removed the next input takes 'v' as default input giving bugged program .
				System.out.println("ALL SET  !!!! ");
				System.out.println("1) press 'S' (set)for setting details of the employee \n2) press 'v'(view) to view details of the employee");
				String inputCommand2 = inputCommand.nextLine();
				int compareResult_2 = inputCommand2.compareTo(str1);  // comparing the input of user to select the correct working mode
				if(compareResult_2 == 0){
					coreFunction();      // recursion 
				}
				else {
					System.out.println("NAME\t\t:"+get.getEmployeeName());                      // getting the details stored using inheritance 
					System.out.println("ID\t\t:"+get.getEmployeeID());							// getting the details stored using inheritance 
					System.out.println("DEPARTMENT\t:"+get.getEmployeeDepartment());			// getting the details stored using inheritance 			
					System.out.println("POSITION\t:"+get.getEmployeeposition());				// getting the details stored using inheritance 	
					System.out.println("SALARY\t\t:"+get.getEmployeeSalary());					// getting the details stored using inheritance 
					intro();     // recursion 
					}
			}
			else {
				System.out.println("INPUT COMMAND : 'E' ");
				System.out.println("EXITING .....");
				
			} 
			 
	 }

///////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 
	 
	public static void main(String[] args){
		intro();	
	}
}

////////////////////////////////////////////////////////////////////////////end of program\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\