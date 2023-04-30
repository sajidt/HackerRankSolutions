package Solutions.Easy;
public class TimeConv {

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
