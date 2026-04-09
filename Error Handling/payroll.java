import java.util.*;

public class payroll {
    static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String EmployeeName;
        int EmployeeID = 0;
        int hours = 0;
        double grossPay, payRate = 0;

        try{
            System.out.println("Insert Employee Name: ");
            EmployeeName = input.nextLine();

            System.out.println("Insert Employee ID: ");
            EmployeeID = input.nextInt();

            System.out.println("Insert hours worked: ");
            hours = input.nextInt();

            System.out.println("Insert hourly pay rate: ");
            payRate = input.nextDouble();


            if (EmployeeName == "") {
                throw new Exception("Employee name cannot be empty");
            } else {
                System.out.println("Employee: " + EmployeeName);
            }
            if (EmployeeID < 0){
                throw new Exception("Employee ID cannot be negative");
            } else {
                System.out.println("Employee ID: " + EmployeeID);
            }
            if (hours > 84 || hours < 0){
                throw new Exception("Work hours cannot be negative or more than 84");
            } else {
                System.out.println("Number of hours worked: " + hours);
            }
            if (payRate < 0 || payRate > 25){
                throw new Exception("Hourly payrate cannot be negative or greater than $25/hr");
            } else {
                grossPay = hours * payRate;
                System.out.println("Your gross pay is $" + grossPay);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}