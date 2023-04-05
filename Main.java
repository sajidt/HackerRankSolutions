package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import java.util.StringTokenizer;

class Result {

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

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "07:05:45PM";  //bufferedReader.readLine();

        String result = TimeConv.timeConversion(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

       // bufferedReader.close();
        System.out.println("Mil Time:" + result);
        //bufferedWriter.close();
    }
}
