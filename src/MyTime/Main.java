package MyTime;

import java.io.IOException;

/**
 * Created by RENT on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MyTime time = new MyTime(18,41,58);
        time.nextSecond();
        System.out.println(time);
    }
}
