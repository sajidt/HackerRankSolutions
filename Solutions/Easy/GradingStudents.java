package Solutions.Easy;
import java.util.*;

public class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int rem = 0;
        List<Integer> retList = new ArrayList<Integer>();
        for ( int i = 0; i < grades.size(); i++) {
            if ( grades.get(i) > 37 ) {
                rem = grades.get(i)%5;
                if (rem > 2) { 
                    retList.add(grades.get(i) + 5- rem);
                } else {
                    retList.add(grades.get(i));
                }
            } else {
                retList.add(grades.get(i));
            }
        }
        return retList;
    }
}
