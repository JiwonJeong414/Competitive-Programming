
/*
ID: jiwonje2
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

class friday {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new FileWriter("friday.out"));

        int N = Integer.parseInt(f.readLine());

        int[] months = { 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3 };
        int[] days = new int[7];

        int day = 0;

        for (int year = 1900; year < 1900 + N; year++) {
            for (int month = 0; month < months.length; month++) {
                days[day]++;
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        months[1] = 1;
                    }
                } else if (year % 4 == 0) {
                    months[1] = 1;
                } else {
                    months[1] = 0;
                }
                day = (day + months[month]) % 7;
            }
        }
        System.out.println(Arrays.toString(days));
        out.print(days[0]);
        out.print(" " + days[1]);
        out.print(" " + days[2]);
        out.print(" " + days[3]);
        out.print(" " + days[4]);
        out.print(" " + days[5]);
        out.print(" " + days[6]);
        out.println();

        out.close();
    }
}