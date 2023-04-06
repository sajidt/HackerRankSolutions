package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import java.util.StringTokenizer;


class birthdayCandles {

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


class TimeConv {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        //StringTokenizer tokens = new StringTokenizer(s, ":");
        String []tokens = s.split(":", 0);
        Integer hr = Integer.parseInt(tokens[0]);
        Integer min = Integer.parseInt(tokens[1]);

        String AMPM = tokens[2].split("\\d+", 0)[1];
        Integer sec = Integer.parseInt(tokens[2].split("[a-zA-Z+]",2)[0]);


        if (AMPM.equalsIgnoreCase("PM") == true &&
             hr != 12 ) hr = (hr + 12);
        else if ( AMPM.equalsIgnoreCase("AM") == true && hr == 12) { hr = 0;}
        //return rem;
        return String.format("%02d:%02d:%02d", hr, min, sec);
    }
}

class gradingStud {

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

class ApplesandOranges {

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

class kangarooJumps {

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

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "07:05:45PM";  //bufferedReader.readLine();
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> result = gradingStud.gradingStudents(grades);
        //String result = TimeConv.timeConversion(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

       // bufferedReader.close();
        //System.out.println("Mil Time:" + result);
        System.out.println("Result=" +result);
        //bufferedWriter.close();
    }
}
