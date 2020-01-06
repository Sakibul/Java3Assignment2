package artifactID2020Java3Assignment2.model;

import artifactID2020Java3Assignment2.service.EmployeeService;

public class Employee {
	private EmployeeService service; // Property / Service Injection
	String fullName;

	public Employee() { }
	
	public Employee(String name) {
		this.fullName = name;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setService(EmployeeService service) {
		this.service = service;
	}
	
	public void setProperties(String fullName, EmployeeService service) {
		this.fullName = fullName;
		this.service = service;
	}
	
	public void showEmployeeMessage() {
		System.out.println("Full name = " + this.fullName);
		service.calculateSalary();
	}
}