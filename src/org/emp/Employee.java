package org.emp;

public class Employee {
	
	private void empId()
	{
	System.out.println("Method1");	
	}
	
	private void empName()
	{
	System.out.println("Method2");	
	}
	
	private void empDob()
	{
	System.out.println("Method3");	
	}
	
	private void empPhone()
	{
	System.out.println("Method4");	
	}
	
	private void empEmail()
	{
	System.out.println("Method5");	
	}
	
	private void empAddress()
	{
	System.out.println("Method6");	
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}
