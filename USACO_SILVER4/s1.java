import java.util.*;
import java.io.*;

class s1 {
    public static void main(String[] args) throws Exception {
        int[] ar = { 1, 2, 3 };

        hello h = new hello(13);
        hello h2 = new hello(33);
        System.out.println(h.urright(h2));
    }

}

class hello {
    private int hello;

    public hello(int d) {
        hello = d;
    }

    public int getHello() {
        return hello;
    }

    public boolean urright(hello h) {
        if (getHello() > h.getHello()) {
            return true;
        }
        return false;
    }
}