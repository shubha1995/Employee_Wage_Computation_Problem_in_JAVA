
public class EmpWage{

	public static void calculateWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {

		
		int FULL_DAYHR=8;
		int PART_TIMEHR=4;
		int day=0;
		int empHr=0;
		int wage = 0;
		System.out.println("Details of " + companyName + " employee");
        System.out.println("|.......................................|");
        System.err.println("Wage per hour:" + wagePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHrs);																		
		
		while (day <= 19) {
			int n = (int) (Math.random() * 10) % 3;
		switch (n) {
		case 1:
			System.out.println("present fullday");
			wage = (wage + (maxWorkingHrs * FULL_DAYHR));
			
            empHr=(empHr+ FULL_DAYHR);
			day++;
			break;
		case 2:
			System.out.println("present PartTime");
			wage = (wage + (maxWorkingHrs * PART_TIMEHR));
			
			empHr=(empHr+ PART_TIMEHR);
			
			day++;
			break;
		default:
			System.out.println("absent");
		    day++;
			if( empHr == 100)
				break;
		}
		 }
		System.out.println("total wage of a month is: " +wage);
		
		System.out.println("Employee Hour: "+empHr);
		System.out.println("Employee Work Day: "+day + "\n");

	}
	public static void main(String[] args) {

        calculateWage("FlipKart", 50, 20, 200);
        calculateWage("Amazon", 25, 25, 250);
		
	}
}

