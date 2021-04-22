/*
    x number of people in a circle. Starting at person 1, give a bill to each,
    and move on. Who gets to $500 first?

    Bills: 1,5,10,20,50,100
*/
package circlemoney;
import java.util.Arrays;
import java.util.Scanner;
public class CircleMoney {
    public static void main(String[] args) {
        
        Scanner k = new Scanner (System.in);
        System.out.print("# of people: ");
        int x = k.nextInt();
        int[] totals = new int[x];
        System.out.print("Total $: ");
        int goal = 0, i = 0, c = 0;
        int[] amount = {1, 5, 10, 20, 50, 100};
        int num = 1;
        System.out.println(Arrays.toString(totals));
        
        while(num != 0){
            
            totals[i] += amount[c];
            if(totals[i] == 500){ num = 0; }
            System.out.println("totals[" + i + "]: " + totals[i]);
            ++i; ++c;
            if(i == x){ i = 0; }
            if(c == 6){ c = 0; }
            
        }
        System.out.println(Arrays.toString(totals));
        
    }
}