package Arraylist;

public class Employee {
	
	String name,phone,gender;
	int id;
	
	public Employee(String name,int id,String gender,String phone) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.phone=phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}

}
