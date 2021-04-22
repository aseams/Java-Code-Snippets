/*
    A surpasser of an element of an array is a greater element to its right, 
    therefore x[j] is a surpasser of x[i] if i < j and x[i] < x[j]. The surpasser 
    count of an element is the number of surpassers. Given an array of distinct 
    integers, for each element of the array find its surpasser count i.e. count 
    the number of elements to the right that are greater than that element.

      Input           Output
    4 5 1 2 3       1 0 2 1 0

*/
package surpassercount;
import java.util.Arrays;
public class SurpasserCount {
    public static void main(String[] args) {
        
        
        int[] in = new int [10];
        int[] out = new int [in.length];
        int count = 0;
        int range = (10 - 0) + 1;
        
        
        for(int i = 0; i < in.length; ++i){
        
            in[i] = (int)(Math.random() * range) + 0;
        
        }
        
        
        for(int i = 0; i < in.length; ++i){
            
            for(int j = i; j < in.length; ++j){
                    if(in[i] < in[j])
                        ++out[count];
            }
            
            ++count;
        }
        
        
        System.out.println("in[]: " + Arrays.toString(in));
        System.out.println("out[]: " + Arrays.toString(out));
    }
}