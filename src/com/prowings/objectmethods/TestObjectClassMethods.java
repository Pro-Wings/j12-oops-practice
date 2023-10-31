package com.prowings.objectmethods;

public class TestObjectClassMethods {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram");
		Employee emp2 = new Employee(10, "Ram");
		
		System.out.println(emp1 == emp2);
		
		System.out.println(emp1.equals(emp2));
		
		int hascodeEmp1 = emp1.hashCode();
		
		System.out.println(hascodeEmp1);

		int hascodeEmp2 = emp2.hashCode();
		
		System.out.println(hascodeEmp2);
		
		
	}
	

}
