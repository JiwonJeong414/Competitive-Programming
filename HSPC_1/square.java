import java.io.*;
import java.util.*;

class square {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("square.in"));
        PrintWriter out = new PrintWriter(new FileWriter("square.out"));

        int max = 0;
        int r = Integer.parseInt(f.readLine());
        int c = Integer.parseInt(f.readLine());

        int[][] ar = new int[r][c];
        for (int i = 0; i < r; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 0; j < c; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
        int count = 0;
        int nexttoken = 0;
        int s = 0;
        int nextsize = 2;
        int row = 0;
        boolean one = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nexttoken = 0;
                if (ar[i][j] == 1) {
                    one = true;
                    s = 2;
                    nexttoken = 0;
                    row = 0;
                    count = 0;
                    for (int tokencheck = 0; tokencheck < s; tokencheck++) {
                        if (ar[i + row][j + nexttoken] == 1) {
                            nexttoken++;
                            count++;
                            System.out.println("row: " + row);
                            System.out.println("nexttoken: " + nexttoken);
                        } else {
                            break;
                        }
                        if (nexttoken == s) {
                            tokencheck = 0;
                            nexttoken = 0;
                            row++;
                            System.out.println("---------------");
                        }
                        if (count == s * s) {
                            tokencheck = 0;
                            nextsize++;
                            s++;
                        }
                        // System.out.println("row: " + i);
                        // System.out.println("column: " + j);
                        // System.out.println("nexttoken: " + nexttoken);
                        // System.out.println("row: " + row);
                        // System.out.println("nextsize: " + nextsize);
                        // System.out.println("s: " + s);
                        // System.out.println("tokencheck: " + tokencheck);
                        // System.out.println("-------------");
                    }
                }
            }
        }
    }
}