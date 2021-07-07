package bridgelabz;
public class employee {
	public static final int isFulltime = 1;
	public static final int isParttime = 2;
	public static final int empRatePerHrs = 20;
	public static final int numWorkingDays = 20;
	public static final int maxHrsMonth =10;
	public static final int empHrs = 8;
	
	void checkEmployee () {
		int isPresent = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == isPresent)
		 	System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		}
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage");
		
		employee people = new employee();
		people.checkEmployee();
	}
}
