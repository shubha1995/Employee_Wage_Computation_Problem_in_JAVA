package com.addressbook;


public class EmpWage{
	    int FULL_DAYHR=8;
	    int PART_TIMEHR=4;
	    
	    private final String companyName;
	    private final int wagePerHr;
	    private final int maxWorkingDays;
	    private final int maxWorkingHrs;
	    private int totalWage;

	    public EmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
	    	this.companyName = companyName;
	    	this.wagePerHr = wagePerHr;
	    	this.maxWorkingDays = maxWorkingDays;
	    	this.maxWorkingHrs = maxWorkingHrs;
	    }
		public void calculateWage() {
		
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

	@Override
		public String toString() {
			return "EmpWage [companyName=" + companyName + ", wagePerHr=" + wagePerHr + ", maxWorkingDays="
					+ maxWorkingDays + ", maxWorkingHrs=" + maxWorkingHrs + ", totalWage=" + totalWage + "]";
		}
	public static void main(String[] args) {
		
		EmpWage flipkart = new EmpWage("Flipkart", 50, 20, 200);
		EmpWage amazon = new EmpWage("Amazon", 25, 25, 250);


        flipkart.calculateWage();
        System.out.println(flipkart);

        amazon.calculateWage();
        System.out.println(amazon);
	}
}

