public class EmpWage
{
    public static void main(String args[])
    {
         final int Part_Time = 1;
         final int Full_Time = 2;
         final int Wage_Per_hr = 20;
         final int Working_Days = 20;
    
        int totalWage = 0;
        for (int day = 1; day <= Working_Days; day++)
        {
            int empType = (int) (Math.random() * 10) % 3;
            int Working_Hours =0;
            switch (empType)
            {
                case Full_Time:
                    Working_Hours = 8;
                    break;
                case Part_Time:
                    Working_Hours = 4;
                    break;
                default:
            }
            int wage = Working_Hours * Wage_Per_hr;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);        
    }
}