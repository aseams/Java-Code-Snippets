package payroll.overtime.calc;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PayrollOvertimeCalc {
    public static void main(String[] args) {
        
        double hoursWorked, hourlyPay, grossPay = 0, overTime, overTimeHours, netPay;
        double dependents, taxableIncome, tax = 0, dependentFactor = 0;
        
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter the number of hours worked = ");
        hoursWorked = k.nextDouble();
        System.out.print("Enter the hourly pay = ");
        hourlyPay = k.nextDouble();
        System.out.print("Enter the number of dependents =  ");
        dependents = k.nextDouble();
        
        DecimalFormat f = new DecimalFormat ("#0.00");
        
        overTimeHours = hoursWorked - 40;
        
        if (dependents == 0)
            dependentFactor = 0;
        else if (dependents == 1)
            dependentFactor = .04;
        else if (dependents == 2)
            dependentFactor = .0775;
        else if (dependents == 3)
            dependentFactor = .1125;
        else if (dependents == 4)
            dependentFactor = .145;
        else if (dependents == 5)
            dependentFactor = .0175;
        else if (dependents >= 6)
            dependentFactor = .2025;
        taxableIncome = grossPay * (1 - dependentFactor);
        
        if (taxableIncome <= 500)
          tax = 0.1*taxableIncome;
        else if (taxableIncome <= 1000) //  501 to 1000
          tax = 0.1*500 + (taxableIncome - 500)*0.15;
        else if (taxableIncome <= 1500) //  1001 to 1500
          tax = 0.1*500 + 0.15*500 + (taxableIncome - 1000)*0.25;
        else if (taxableIncome <= 2000) //  1501 to 2000
          tax = 0.1*500 + 0.15*500 + 0.25*500 + (taxableIncome - 1500)*0.40;
        else
          tax = 0.1*500 + 0.15*500 + 0.25*500 + 0.4*500 + (taxableIncome - 2000)*0.50;
        
        
        grossPay = 40 * 25 + 20 * 37.5 + 5 * 50;
        taxableIncome = 2000 *(1 - 11.25/100);
        tax =  500 * (0.1) + 500 * (0.15) + 500 * (0.25) + 275 * (0.4);
        netPay = grossPay - tax;


        /* if (taxableIncome <= 500) //0 - 500
            tax = .1 * taxableIncome;
        else if (taxableIncome <= 1000) //501 - 1000
            tax = .1 * 500 + (taxableIncome - 500) * .15;
        else if (taxableIncome <= 1500) //1001 - 1500
            tax = .1 * 500 + .15 * 500 + (taxableIncome -1000) * .25;
        else if (taxableIncome <= 2000) //1501 - 2000
            tax = .1 * 500 + .15 * 500 + .25 8 500 + (taxableIncome - 1000) * .4;
            else
            tax = .1 * 500 + .15 * 500 + .25 * 500 + .4 * 500 + (taxableIncome - 1000) * .5 */
        
        
        System.out.println("Gross pay = " + f.format(grossPay));
        System.out.println("Taxable Income = " + f.format(taxableIncome));
        System.out.println("Amount of tax = " + f.format(tax));
        System.out.println("Amount of tax = " + f.format(netPay));
        
        
/*        if (hoursWorked <= 40){
           
        System.out.println("Gross pay = " + f.format(grossPay));
        
        }
        else {
        
        overTime = 40 * hourlyPay + overTimeHours * (hourlyPay * 1.5);
        System.out.println("Gross pay = " + f.format(overTime)); */
        
        }
        
}