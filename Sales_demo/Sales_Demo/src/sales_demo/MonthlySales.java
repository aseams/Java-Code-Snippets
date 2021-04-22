package sales_demo;
public class MonthlySales{
    double[] sales;
    double avg, comm;
    
    MonthlySales(double[] sales, double[] wages) {
        this.sales = sales;
    }
    
    public void average(){
        double total = 0;
        for(int i = 0; i < sales.length; ++i){
        
            total +=sales[i];
        
        }
        
        avg = total/sales.length;
    }
    
    public void comm(){
        
        if(avg >= 0 && avg <= 5)
            comm = 10;
        else if(avg >= 5.1 && avg <= 10)
            comm = 15;
        else if(avg >= 10.1 && avg <= 15)
            comm = 18;
        else if(avg >= 15.1 && avg <= 20)
            comm = 20;
        
    }
    
}