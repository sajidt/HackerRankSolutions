package Solutions.Easy;
public class KangarooJumps {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int k1pos = x1;
        int k2pos = x2;
        
        while(true){
             //win condition
            if ( k1pos == k2pos) return "YES";
            
            //fail condition
                  
            if ( v2 >= v1 && k2pos > k1pos) return "NO";
            if ( v1 >= v2 && k1pos > k2pos ) return "NO";
            
           
            //add the step
            k1pos += v1;
            k2pos += v2;
        }
    }
}