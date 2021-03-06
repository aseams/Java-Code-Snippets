package easynumbers;
import java.util.*;
import java.io.*;
public class EasyNumbers {
    public static void main (String[] args) throws java.lang.Exception{
        Reader re = new Reader(System.in);
        int val = 0;
        int table[][] = 
        {
            {}, {},
            {1, 1, 1}, {1, 2, 3, 3, 3, 2, 2}, 
            {1, 3, 6, 8, 8, 7, 4, 1}, {1, 4, 10, 17, 21, 21, 21, 13, 10, 6, 4}, 
            {1, 5, 15, 30, 45, 54, 54, 49, 46, 21, 3, 1}, {1, 6, 21, 49, 87, 121, 145, 145, 145, 121, 92, 56, 33, 20, 14, 7, 3, 1, 1}, 
            {1, 7, 28, 74, 148, 238, 324, 367, 367, 320, 258, 188, 122, 69, 37, 12, 6, 3}, {1, 8, 36, 108, 252, 454, 706, 898, 1039, 1039, 1039, 869, 674, 473, 309, 216, 126, 66, 34, 18, 8, 5, 3},
            {1, 9, 45, 150, 375, 750, 1200, 1713, 2227, 2492, 2492, 2225, 2041, 1575, 1132, 770, 571, 335, 180, 90, 44, 18, 12, 6, 3, 1},{1, 10, 55, 202, 560, 1232, 2278, 3574, 4959, 6074, 6709, 6709, 6709, 5703, 4493, 3294, 2217, 1468, 872, 514, 282, 143, 65, 28, 14, 7, 2}, 
            {1, 11, 66, 264, 792, 1900, 3800, 6514, 9772, 13030, 15471, 16799, 16799, 15652, 13418, 10748, 8079, 5688, 3774, 2381, 1435, 817, 445, 226, 108, 45, 20, 3, 1},{1, 12, 78, 338, 1105, 2874, 6278, 11660, 19068, 27607, 36136, 42702, 46610, 46610, 46610, 41294, 33796, 25982, 18892, 13103, 8577, 5356, 3162, 1743, 944, 470, 250, 126, 63, 25, 10, 4, 2, 2, 2, 1},
            {1, 13, 91, 424, 1484, 4154, 9707, 19414, 29121, 42063, 59159, 75615, 88747, 95597, 95597, 89036, 80204, 65867, 51176, 37661, 26428, 17759, 11353, 6821, 4096, 2220, 1165, 605, 310, 139, 69, 27, 10, 6, 2, 1, 1, 1, 1, 1},{1, 14, 105, 525, 1995, 5985, 15960, 34199, 64409, 107154, 171563, 233954, 296371, 342124, 368134, 368134, 368134, 324876, 281553, 222037, 171005, 122130, 84431, 54937, 34827, 20907, 12333, 7023, 3880, 2057, 1167, 564, 260, 129, 62, 20, 7, 1, 1},
            {1, 15, 120, 640, 2560, 8192, 21888, 50030, 100060, 178236, 285074, 414662, 554018, 681778, 779164, 831886, 831886, 782347, 701717, 591178, 473607, 361604, 263114, 183069, 121870, 78013, 48065, 28497, 16204, 8852, 4742, 2457, 1216, 565, 259, 124, 46, 21, 10, 3}
        };
        int T = re.nextInt();
        while(T-->0){
            int b = re.nextInt();
            int d = re.nextInt();
            if(d >= table[b].length)
                System.out.println(0);
            else{
                val = table[b][d] % (int) (Math.pow(10, 9) + 7);
                System.out.println("num: " + val);
            }
        }
    }
}
 
class Reader{
    
    BufferedReader br;
    StringTokenizer st;
    
    Reader(InputStream in) throws Exception{
        br = new BufferedReader(new InputStreamReader(in));
        st = new StringTokenizer("");
    }
 
    String next() throws Exception{
        while(!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
 
    int nextInt() throws Exception{
        return Integer.parseInt(next());
    }
    
}