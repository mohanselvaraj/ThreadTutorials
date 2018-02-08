package com.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEmployeeName {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee emp1 = new Employee(10,200.0,"mohan","selvaraj");
		Employee emp2 = new Employee(20,100.0,"subho","mukerjee");
		Employee emp3 = new Employee(30,300.0,"rk","cheruki");
       List<Employee> listEmp = new ArrayList<Employee>();
       listEmp.add(emp1);
       listEmp.add(emp2);
       listEmp.add(emp3);
       Collections.sort(listEmp);
       for(Employee emmy:listEmp){
    	   System.out.println( emmy.getfName() + emmy.getlName() +emmy.getSalary() + emmy.getId());
       }
      
       listEmp.sort( new Comparator<Employee>(){

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getId()-o2.getId();
		}
    	   
       });
       for(Employee emmy:listEmp){
    	   System.out.println( emmy.getfName() + emmy.getlName() +emmy.getSalary() + emmy.getId());
       }
	}

}