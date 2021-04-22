/*
    Given are the heights of certain Buildings which lie adjacent to each other.
    Sunlight starts falling from left side of the buildings. If there is a building
    of certain Height, all the buildings to the right side of it having lesser
    heights cannot see the sun. The task is to find the total number of such
    buildings that receive sunlight.

    Input:              Output:
    6 2 8 4 11 13       Number of building receiving sunlight = 4
*/
package sunlightproblem;
public class SunlightProblem {
    public static void main(String[] args) {
        
        int[] heights = {6, 2, 8, 4, 11, 13};
        int total = 1;
        int top = 0;
        top = heights[0];
        for(int i = 0; i < heights.length; ++i){
            if(top < heights[i]){
                top = heights[i];
                ++total;
            }
        }
        System.out.println("total: " + total);
    }
}