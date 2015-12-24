import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import static java.lang.System.out;

public class J13Parallel {
    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .parallelStream()
                .forEach(v -> {
                    try {
                        Thread.sleep(3 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    out.print(v);
                });
    }
}


