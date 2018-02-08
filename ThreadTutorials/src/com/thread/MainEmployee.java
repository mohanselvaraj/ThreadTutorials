package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*class EmployeeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Employee)o1).getId() - ((Employee)o2).getId();
	}
	
}*/
public class MainEmployee {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee emp1 = new Employee(15,200.0,"mohan","selvaraj");
		Employee emp2 = new Employee(50,300.0,"subho","mukerjee");
		Employee emp3 = new Employee(30,150.0,"Rk","cheruki");
		Employee emp4 = new Employee(70,900.0,"Rk","cheruki");
       List<Employee> listEmp = new ArrayList<Employee>();
       listEmp.add(emp1);
       listEmp.add(emp2);
       listEmp.add(emp3);
       listEmp.add(emp4);
       Collections.sort(listEmp);
       /*for(Employee emmy:listEmp){
    	   System.out.println( emmy.getfName() + emmy.getlName() +emmy.getSalary() + emmy.getId());
       }*/
       //Arrays.sort(lName);
       
       listEmp.sort( new Comparator<Employee>(){
       
    	   @Override
    	   public int compare(Employee o1, Employee o2) {
   			// TODO Auto-generated method stub
    		//return (o1.getfName().compareTo(o2.getfName()));
   			return (o1.getlName().compareTo(o2.getlName()));
   		
   			
   		
   			//return o1.getId()-o2.getId();
   			//return o1.getSalary()-o2.getSalary();
   		}
		
		/*(public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getId()-o2.getId();
		}*/
    	   
       });
       for(Employee emmy:listEmp){
    	   System.out.println( " FistName: " + emmy.getfName() + " LastName: " 
       + emmy.getlName() + " Salary: " +emmy.getSalary() +  " Id: " + emmy.getId());
       }
	}

}
