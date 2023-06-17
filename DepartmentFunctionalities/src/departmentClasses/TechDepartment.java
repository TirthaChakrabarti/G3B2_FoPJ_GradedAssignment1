package departmentClasses;

import superclass.SuperDepartment;

public class TechDepartment extends SuperDepartment{

	@Override
	public String departmentName() {
		name = "Tech Department";
		return name;
	}
	
	@Override
	public String getTodaysWork() {
		work = "Complete coding of module 1";
		return work;
	}
	
	@Override
	public String getWorkDeadline() {
		deadline = "Compete by EOD";
		return deadline;
	}
	
	public String getTechStackInformation() {
		String stackInfo = "Core Java";
		return stackInfo;
	}
}