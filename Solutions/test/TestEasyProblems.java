package Solutions.test;

import java.util.*;

import Solutions.Easy.*;

public class TestEasyProblems {
    public static void testEasy() {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        
        String s = "07:05:45PM";  //bufferedReader.readLine();
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> result = GradingStudents.gradingStudents(grades);
        //String result = TimeConv.timeConversion(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

       // bufferedReader.close();
        //System.out.println("Mil Time:" + result);
        System.out.println("Result=" +result);
        //bufferedWriter.close();        
    }
}
