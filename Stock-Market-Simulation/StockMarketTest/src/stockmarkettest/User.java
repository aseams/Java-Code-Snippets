/*
 *******************************************************
 * CLASS: User
 * AUTHOR: Andrew Seamon
 * DESCRIPTION:
 *******************************************************
*/
package stockmarkettest;
import java.text.*;
import java.lang.*;
import java.util.*;
public class User{

    private String lName;
    private ArrayList <Stock> holdings;
    private String UID;
    private String fName;
    private Stock s = new Stock("REFERENCE",0.0,0.0);
    
    public User(String UID,String fName,String lName,ArrayList <Stock> holdings){
        this.lName = lName;
        this.holdings = holdings;
        this.UID = UID;
        this.fName = fName;
    }
    
    void addHolding(String name, double buy, double sell){
        holdings.add(new Stock(name,buy,sell));
    }
    
    void removeHolding(Stock remove){
        holdings.remove(holdings.indexOf(remove));
    }
    
    void reviseHolding(){
        int currentIndex = 0;
        for(int i = 0; i < holdings.size(); ++i){
            holdings.replaceAll(hold -> new Stock(s.getName(),s.getBuy(),s.getSell()));
        }
    }
    
}