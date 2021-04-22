package fizzbuzz;

/*
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print "Fizz" instead of the
 * number and for the multiples of five print "Buzz". For 
 * numbers which are multiples of both three and five print 
 * "FizzBuzz".
 */
public class FizzBuzz {
    public static void main(String[] args) {

        String print = "";
        
        for(int i = 1; i <= 100; ++i){
            print = "";
            if(i % 3 == 0 || i % 5 == 0){if(i % 3 == 0 && i % 5 == 0){
                print+= "fizzbuzz";
            }
                if(i % 5 == 0)
                    print += "buzz";
                else
                    print += "fizz";
                System.out.println(print);
            }
            else
            System.out.println(i);
        }
    }
}