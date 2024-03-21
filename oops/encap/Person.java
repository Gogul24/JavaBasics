package oops.encap;

public class Person {
	String firstName,lastName,salutations,gender,ssn,address,zip,phone,dob,bloodGroup;
	String age;
	public Person(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSalutations() {
		return salutations;
	}
	public String getGender() {
		return gender;
	}
	public String getAge() {
		return age;
	}
	public String getSsn() {
		return ssn;
	}
	public String getAddress() {
		return address;
	}
	public String getZip() {
		return zip;
	}
	public String getPhone() {
		return phone;
	}
	public String getDob() {
		return dob;
	} 
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setSalutations(String salutations) {
		this.salutations = salutations;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
