package Solutions.Easy;

import java.util.*;

public class ApplesandOranges {

    
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
          List<Integer> applesxcoordList = new ArrayList<Integer>();
          List<Integer> orangesxcoordList = new ArrayList<Integer>();
          for (Integer apple : apples) {
              applesxcoordList.add(apple + a);
          }
          
          for (Integer orange : oranges) {
              orangesxcoordList.add(orange+b);
          }
          
          int applecount = 0, orangecount = 0;
          
          for ( Integer applexcoord : applesxcoordList) {
              if ( applexcoord >= s && applexcoord <= t) {
                  ++applecount;
              }
          }
            for ( Integer orangexcoord : orangesxcoordList) {
              if ( orangexcoord >= s && orangexcoord <= t) {
                  ++orangecount;
              }
          }
          
          System.out.println(applecount);
          System.out.println(orangecount);

    }
}
