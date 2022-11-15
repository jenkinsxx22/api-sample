package com.api.sample;

import java.util.List;

public class App {
	
	public static void SaveEmployee(Employee emp) {
		System.out.println("Student No:"+emp.getId());
		System.out.println("Student Name:"+emp.getName());
		System.out.println("Student Address:"+emp.getAddress());
	}

/*	public static void GetAllEmployees(List<Employee> elist) {
		System.out.println("List of Employees");
		for (int a=0; a<3; a++) {
			System.out.println("Student Name: "+elist.indexOf(elist));
		}
	}*/
	public static void main(String args[])  {
		
		Employee emp1 = new Employee(1,"Nisar","Sukkur");
		Employee emp2 = new Employee(2,"Ahmed","Sukkur");
		Employee emp3 = new Employee(2,"Abbasi","Sukkur");
		SaveEmployee(emp1);
		SaveEmployee(emp2);
		SaveEmployee(emp3);

		
//		GetAllEmployees(emplist1);

	}
}
