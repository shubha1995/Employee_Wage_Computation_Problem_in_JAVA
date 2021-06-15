import java.util.Scanner;
public class EmpWage{
	public static void main(String [] args) {
		int attendence = 1;
		int Wage_Per_hr = 20;
		int Full_Day_Work = 8;
		int Part_Time_Worker = 4; 
		

		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == attendence) {
			System.out.println("Emp is Present");
			Scanner sc = new Scanner (System.in);
		System.out.println("please enter 1 for fullTime or Enter 2 for Part Time");
		int n = sc.nextInt();
		sc.close();
			switch(n){
		case 1: 
		
		System.out.println("Employee Daily Wage is: " +Wage_Per_hr*Full_Day_Work);
		break;
		case 2:
		System.out.println("Part Employee Daily Wage is: " +Wage_Per_hr*Part_Time_Worker);
			break;
			default:
			System.out.println("please select only 1 and 2");
			}
			}
		else 
		System.out.println("EMp is Absent");
		
}
}