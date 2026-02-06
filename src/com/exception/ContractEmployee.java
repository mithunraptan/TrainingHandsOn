package com.exception;

public class ContractEmployee implements Employee {
	
	
	String id;
	String name;
	String department;
	String type;
	double salary;
	double hra;
	double hoursWorked;
	double hourlyRate;
	
	
	
	public ContractEmployee(String id, String name, String department, String type, double salary, double hra,
			double hoursWorked, double hourlyRate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.type = type;
		this.salary = salary;
		this.hra = hra;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}


	
	@Override
	public double calculateFinalSalary(double totalAmount) throws InvalidSalaryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}



	@Override
	public String toString() {
		return "ContractEmployee [id=" + id + ", name=" + name + ", department=" + department + ", type=" + type
				+ ", salary=" + salary + ", hra=" + hra + ", hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate
				+ "]";
	}

}
