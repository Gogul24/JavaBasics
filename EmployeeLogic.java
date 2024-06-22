package task;

public class EmployeeLogic {
	
		String empname,empId,jobRole,salary;
		
		public EmployeeLogic(String empname,String empId,String jobRole,String salary) {
			this.empId=empId;
			this.empname=empname;
			this.jobRole=jobRole;
			this.salary=salary;
		}
		
		public String getEmpId() {
			return empId;
		}
		public String getEmpname() {
			return empname;
		}
		public String getJobRole() {
			return jobRole;
		}
		public String getSalary() {
			return salary;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public void setJobRole(String jobRole) {
			this.jobRole = jobRole;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
}
