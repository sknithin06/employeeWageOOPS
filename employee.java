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
	void calculateUsingSwicth ( ) {
		int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
		 int Emphrs = 0;
		 switch ( EmpCheck) {
		 	case  isFulltime :
		 		  Emphrs = 8;
		 		break ;
		 	case  isParttime :
		 		 Emphrs = 4;
		 		break;
		 	default:
		 		 Emphrs = 0;
		 }
		 double empWages = Emphrs * empRatePerHrs;
		 System.out.println("empwage is:"+empWages);
	}
	void calculateMonthlyWage () {
		int emphrs = 0, empwage = 0, totalEmpWage = 0;
		 for (int day = 0; day < numWorkingDays; day++) {
			 int EmployeeCheck = (int) Math.floor(Math.random() * 10) % 3;
			 switch ( EmployeeCheck ) {
			 	case  isFulltime :
			 		  emphrs = 8;
			 		break ;
			 	case  isParttime :
			 		 emphrs = 4;
			 		break;
			 	default:
			 		 emphrs = 0;
			 }
			 empwage = emphrs * empRatePerHrs;
			 totalEmpWage += empwage;
		}
		 System.out.println("totalEmpWage is:"+totalEmpWage);
	}
	void calculateWageDays() {
		int EMPHRS =0, totalEmpHrs =0, totalWorkingDays =0;
		 while (totalEmpHrs <= numWorkingDays && 
				totalWorkingDays < maxHrsMonth) {  
			 totalWorkingDays++;
			 int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
			 switch ( employeeCheck) {
			 	case  isFulltime :
			 		  EMPHRS = 8;
			 		break ;
			 	case  isParttime :
			 		  EMPHRS= 4;
			 		break;
			 	default:
			 		 EMPHRS = 0;
			 }
			 totalEmpHrs += EMPHRS;
			 System.out.println("Day#: " + totalWorkingDays + " Emphr: " +EMPHRS);
			 int empWages = EMPHRS * empRatePerHrs;
			 System.out.println("empwage is:"+empWages);
		 }
		 int totalEmpWages = totalEmpHrs * empRatePerHrs;
		 System.out.println("totalEmpWages is:"+totalEmpWages);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage");
		
		employee people = new employee();
		people.checkEmployee();
		people.calculateDailyWage();
		people.calculateAddPartTime();
		people.calculateUsingSwicth();
		people.calculateMonthlyWage();
		people.calculateWageDays();
	}
}
