public class EmpWage{
	public static void main(String[] args){
		
		int Full_Time=1;
		int Wage_per_hr=20;
		int Full_Day_hr=8;
		
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == Full_Time)
		{
			System.out.println("Employee is Present");
			int Daily_Emp_Wage = Wage_per_hr * Full_Day_hr;
			System.out.println("Daily Employee Wage is : " + Daily_Emp_Wage);
			
		}
		else
		{
			System.out.println("Employee is Abscent");
		}
		
	}
	
}