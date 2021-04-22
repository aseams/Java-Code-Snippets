/*
 *******************************************************
 * PROJECT: StockMarketTest
 * AUTHOR: Andrew Seamon
 * DESCRIPTION:
 *******************************************************
*/
package stockmarkettest;
import java.text.*;
import java.lang.*;
import java.util.*;
public class StockMarketTest {
    public static void main(String[] args) {
        
        
        
    }
    
    void init(){
        
        double buyPrice = 0, mult = 0, sellCost = 0;
        String[] stockName = {"AAPL","INTL","NVDA"};
        ArrayList <Stock> holdings = null;
        String fName = null, lName = null, UID = null;
        
        Random r = new Random();
        
        for(int i = 0; i < stockName.length; ++i){
            mult = r.nextDouble();
            buyPrice = r.nextDouble() * mult;
            sellCost = buyPrice - (buyPrice * .1);
            Stock s = new Stock(stockName[i],buyPrice,sellCost);
        }
        
        User u = new User(UID,fName,lName,holdings);
        
    }

}