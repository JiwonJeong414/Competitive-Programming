
/*
ID: jiwonje2
LANG: JAVA
TASK: milk2
*/
import java.util.*;
import java.io.*;

class milk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
        PrintWriter out = new PrintWriter(new FileWriter("milk2.out"));

        int N = Integer.parseInt(f.readLine());

        int[] start = new int[N];
        int[] end = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int max = 0;
        int idle = 0;

        for (int i = 0; i < start.length; i++) {
            int s = start[i];
            while(i < start.length - 1 && end[i] >= start[i + 1]){
                i++;
            }
            max = Math.max(max, end[i] - s);
            if(i < start.length - 1)
                idle = Math.max(idle, start[i + 1] - end[i])
        }
        out.println(max + " " + idle);
        out.close();
    }
}