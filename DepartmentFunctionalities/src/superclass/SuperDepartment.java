package superclass;

public class SuperDepartment {
	
	protected String name;
	protected String work;
	protected String deadline;
	protected String isHoliday;

	public String departmentName() {
		name = "Super Department";
		return name;
	}
	
	public String getTodaysWork() {
		work = "No work as of now";
		return work;
	}
	
	public String getWorkDeadline() {
		deadline = "Nil";
		return deadline;
	}
	
	public String isTodayAHoliday() {
		isHoliday = "Today is not a Holiday";
		return isHoliday;
	}
}
