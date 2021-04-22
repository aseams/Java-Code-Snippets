/*
 *******************************************************
 * CLASS: Stock
 * AUTHOR: Andrew Seamon
 * DESCRIPTION:
 *******************************************************
*/
package stockmarkettest;
import java.text.*;
import java.lang.*;
import java.util.*;
public class Stock{

    private String name;
    private double buy;
    private double sell;
    
    Stock(String name, double buy, double sell) {
        
        this.name = name;
        this.buy = buy;
        this.sell = sell;
        
    }
    
    String getName(){
        return this.name;
    }
    
    double getBuy(){
        return this.buy;
    }
    
    double getSell(){
        return this.sell;
    }
    
    void setName(String newName){
        this.name = newName;
    }
    
    void setBuy(double newBuy){
        this.buy = newBuy;
    }
    
    void setSell(double newSell){
        this.sell = newSell;
    }
    
    
    
}