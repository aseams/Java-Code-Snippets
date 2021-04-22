/*
 *******************************************************
 * PROJECT: MultiplicativePersistence
 * AUTHOR: Andrew Seamon
 * DESCRIPTION:
 *******************************************************
 */
package MultiplicativePersistence;
public class multiplicativePersistence {

    static int currNum = 1;

    public static void main(String[] args) {
        int startNum = 26899889;
        System.out.println("startNum: " + startNum);
        int result = persistence(startNum);
        System.out.println(startNum + " has a multiplicative persistence of " + result);
    }
    
    static int persistence(int num) {
        int count = 0, sum = 1, i;
        Boolean r = true;
        String string = null;
        if (num < 10) {
            return 0;
        } else {
            //Convert Integer to String by Integer.ToString()
            string = Integer.toString(num);
            while (r) {
                for (i = 0; i < string.length() - 1; i++) {
                    //Integer.parseInt() function convert String to Integer
                    sum = sum * Integer.parseInt(string.substring(i, i + 1));
                }
                //Integer.parseInt() function convert String to Integer
                sum = sum * Integer.parseInt(string.substring(i, string.length()));
                if (sum < 10) {
                    r = false;
                } else {
                    //Convert Integer to String by Integer.ToString()
                    string = Integer.toString(sum);
                    sum = 1;
                }
                count++;
            }
        }
        return count;
    }

}

/*
    The persistence of an integer is the number of times you can perform the
    following before ending up at a single digit:
    1) Take the digits of the integer and multiply them together to give a new integer.
    2) Repeat #1 using the new integer.
 */