package sales_demo;
import java.text.*;
import java.util.Arrays;
public class Sales_Demo {
    public static void main(String[] args) {
        
        double[] sales = {10.6, 11.7, 15.6, 16.5, 6.4, 16.3, 16.1, 22.9, 8.4,
            13.5, 18.1, 12.1, 22.4, 18.8, 8.8, 12.5, 18.9, 18.2, 9, 13.2};
        double[] wages = {9.3, 8.3, 10.7, 7.9, 9.8, 7.4, 5.6, 10.4, 8.8, 8.9,
            9.7, 8.8, 10.7, 5.3, 8.4, 10, 8.6, 8.5, 5.7, 10.3};
        
        DecimalFormat f = new DecimalFormat ("#0.00");
        Salary s = new Salary(sales, wages);
        
        System.out.println("Sales avg: " + s.avg);
        System.out.println("Commission %: " + (int) s.comm + "%");
        System.out.println("Sales commission: " + s.commi);
        System.out.println("totalPay: " + f.format(s.totalPay));
        
    }
    
}