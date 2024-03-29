package Solutions.Algorithms;

import java.util.List;

class BetweenSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int minNumber = a.get(0);
    int maxNumber = b.get(0);
    int numbersFound = 0;
    boolean found;
    for (int count=minNumber; count<=maxNumber; ++count) {
        found = true;
        for (Integer x : a) {
            int xint = (int)x;
            if ( count%xint != 0) {
                found = false;
                break;
            }
        }
        if (found != false) {
            for (Integer y : b) {
                int yint = (int)y;
                if ( yint%count != 0) {
                    found = false;
                    break;
                }
               
            }
        }
        if (found) { ++numbersFound;}
    }
        return numbersFound;
    }
}