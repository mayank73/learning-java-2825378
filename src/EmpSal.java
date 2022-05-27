import java.util.Scanner;

public class EmpSal {

    public static void calculateEmpSalary(int empHoursPerWeek, 
                                          int hourRate, 
                                          String employeeName,
                                          int holidays){
        if ((empHoursPerWeek < 0) || (hourRate < 0) || (holidays < 0)) {
            System.out.println("Please enter valid inputs");
            System.exit(1);
        }
        
        int holidayHours = holidays * 8;
        int grossSalary = ((empHoursPerWeek * 52) + holidayHours) * hourRate; 
        System.out.println("Gross Salary of the employee "+ employeeName+" with "+ holidays + " encashed holidays is: "+ grossSalary);
    }
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter the employee name here: ");
        String empName = input.next();
        
        System.out.println("Lets Calculate the Annual groos Salary of Employee "+ empName);
        
        System.out.println("Enter the Employee's hours per week: ");
        int weekHours = input.nextInt();
        
        System.out.println("Enter the Employee's current Hour Rate: ");
        int rate = input.nextInt();

        System.out.println("Enter the Employee's remaining holidays to be encashed: ");
        int holidays = input.nextInt();
        
        calculateEmpSalary(weekHours, rate, empName, holidays);
    }
    }
}
