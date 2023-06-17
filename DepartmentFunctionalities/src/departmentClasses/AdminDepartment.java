package departmentClasses;

import superclass.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		name = "Admin Department";
		return name;
	}
	
	@Override
	public String getTodaysWork() {
		work = "Complete your documents submission";
		return work;
	}
	
	@Override
	public String getWorkDeadline() {
		deadline = "Complete by EOD";
		return deadline;
	}
}
