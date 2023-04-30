package Solutions.Easy;
import java.util.*;

public class BirthdayCandles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Integer max = candles.get(0);
        for ( int i = 0; i < candles.size(); i++) {
            if ( max < candles.get(i) ) max = candles.get(i).intValue();
        }
        Integer maxCounter=0;

        for ( int j = 0; j < candles.size(); j++) {
            if (candles.get(j) == max) ++maxCounter;
        }
        return maxCounter;
    }
}
