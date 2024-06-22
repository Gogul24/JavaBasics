package task;

public class Empmain {

	public static void main(String[] args) {
		EmployeeLogic emp = new EmployeeLogic("Gokul", "EZ9876", "Testing", "500000");
		System.out.println("Employee Name : "+emp.empname+"\n"+"Employee id : "+emp.empId+"\n"+"Job role : "+emp.jobRole+" \n"+"Salary : "+emp.salary);

	}

}
