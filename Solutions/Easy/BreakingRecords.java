package Solutions.Easy;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
        /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int min_score = (int)scores.get(0);
        int max_score = (int)scores.get(0);
        int min_count = 0;
        int max_count = 0;
        
        List<Integer> min_max_records = new ArrayList<> ();
        for ( Integer score : scores ) {
            if ( score < min_score ) { min_score = score; min_count++;}
            if ( score > max_score ) { max_score = score; max_count++;}
        }
        min_max_records.add(max_count);
        min_max_records.add(min_count);
        return min_max_records;
    }

}
