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
	void calculateDailyWage () {
		int isPresent = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		double Salary=(empHrs * empRatePerHrs) ;
		 if (empcheck == isPresent) {
			 System.out.println("Salary is ="+Salary);
		 }
		 else {
			Salary = 0;
		 	System.out.println("Salary is ="+Salary);
		 }
	}
	void calculateAddPartTime () {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		 if (empCheck == isFulltime) {
			 double empHr = 12;
			 double salary=(empHr * empRatePerHrs);
			 System.out.println("salary is ="+salary);
		 } 
		 else if (empCheck == isParttime) {
			double emphr = 8;
		    double salary=(emphr * empRatePerHrs);
		    System.out.println("salary is ="+salary);
		 }
		 else {
			double salary = 0;
			System.out.println("Salary is ="+salary);
		 }
	}
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage");
		
		employee people = new employee();
		people.checkEmployee();
		people.calculateDailyWage();
		people.calculateAddPartTime();
	}
}
