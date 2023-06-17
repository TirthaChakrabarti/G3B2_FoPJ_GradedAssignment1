package main;

import departmentClasses.AdminDepartment;
import departmentClasses.HrDepartment;
import departmentClasses.TechDepartment;

public class DriverClassMain {

	public static void main(String[] args) {
		
		//Creating objects of AdminDepartment, HrDepartment and TechDepartment

		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment HrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		
		//Displaying Admin department's functionalities
		
		System.out.println("Welcome to "+adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println("");
		
		//Displaying HR department's functionalities
		
		System.out.println("Welcome to "+HrDept.departmentName());
		System.out.println(HrDept.doActivity());
		System.out.println(HrDept.getTodaysWork());
		System.out.println(HrDept.getWorkDeadline());
		System.out.println(HrDept.isTodayAHoliday());
		
		System.out.println("");
		
		//Displaying Tech department's functionalities
		
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}
}
