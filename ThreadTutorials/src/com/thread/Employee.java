package com.thread;

public class Employee implements Comparable {
	private Integer id;
	private Double salary;
	private String fName;
	private String lName;
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	public Employee(Integer id,Double salary,String fName,String lName){
		this.id =id;
		this.salary = salary;
		this.fName = fName;
		this.lName =lName;
	}
	public Employee(Integer id){
		this.id =id;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public int compareTo(Object emp) {
		// TODO Auto-generated method stub
		return (int) (this.getSalary() - ((Employee) emp).getSalary());
	}
	

}
