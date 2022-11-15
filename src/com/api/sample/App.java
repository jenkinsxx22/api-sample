package com.api.sample;

public class App {
	
	public void SaveEmployee(Employee emp) {
		
	}

	public static void main(String args[]) {
		
		Employee emp1 = new Employee(1,"Nisar","Sukkur");
		Employee emp2 = new Employee(2,"Ahmed","Sukkur");
		Employee emp3 = new Employee(2,"Abbasi","Sukkur");

	System.out.println(
			"ID:"+emp1.getId()+
			"Name:"+emp1.getName()+
			"Address:"+emp1.getAddress()
			);
	System.out.println(
			"ID:"+emp2.getId()+
			"Name:"+emp2.getName()+
			"Address:"+emp2.getAddress()
			);
	System.out.println(
			"ID:"+emp3.getId()+
			"Name:"+emp3.getName()+
			"Address:"+emp3.getAddress()
			);
		
		
	}
}
