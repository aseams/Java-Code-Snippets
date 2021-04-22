package sales_demo;
public class Salary extends MonthlySales{
    double commi;
    double[] wage;
    double totalPay;

    public Salary(double[] sales, double[] wages) {
        
        super(sales, wages);
        super.average();
        super.comm();
//        System.out.println("avg: " + avg);
//        System.out.println("this.comm: " + comm);
        
        commi();
        //System.out.println("commi: " + commi);
        wage = wages;
        totalPay();
        
    }
    
    private void commi(){
        commi = avg * (super.comm / 100);
    }
    
    private void totalPay(){
        
        for(int i = 0; i < wage.length; ++i){
            
            this.totalPay += wage[i] + commi;
            
        }
    }

}