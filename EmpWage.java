public class EmpWage{
	public static void main(String[] args){
		
		int Full_Time=1;
		int Wage_per_hr=20;
		int Full_Day_hr=8;
		
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == Full_Time)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Abscent");
		}
		
	}
	
}