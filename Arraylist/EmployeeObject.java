package Arraylist;

import java.util.ArrayList;

public class EmployeeObject {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Gokul", 24, "Male", "8675515975"));
		employees.add(new Employee("Ramesh", 33, "Male", "9987654321"));
		employees.add(new Employee("Juby", 64, "Female", "9876548765"));
		
		for(int i=0;i<employees.size();i++) {
			Employee emp = employees.get(i);
			System.out.println("Name :"+emp.getName()+" "+"Id :"+emp.getId()+" "+"Gender :"+emp.getGender()+" "+"Phone number :"+emp.getPhone());
		}
		System.out.println("**************************************");
		employees = sort(employees);
		employees.forEach(emp -> {
			System.out.println("Name :"+emp.getName()+" "+"Id :"+emp.getId()+" "+"Gender :"+emp.getGender()+" "+"Phone number :"+emp.getPhone());
		});
	}
	
	public static ArrayList<Employee> sort(ArrayList<Employee>employees){
		for(int i=0;i<employees.size();i++) {
			for(int j=0;j<employees.size();j++) {
				if(employees.get(i).getName().compareTo(employees.get(j).getName())<0) {
					Employee temp = employees.get(i);
					employees.set(i, employees.get(j));
					employees.set(j, temp);
				}
			}
		}
		return employees;
		
	}

}
