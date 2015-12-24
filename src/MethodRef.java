import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by a on 12/24/15.
 */
public class MethodRef {
    public static void main(String[] args) {
        // v -> System.out.println(v)
        Arrays.asList(1, 2, 3).forEach(System.out::println);

        // v -> v.toUpperCase()
        Arrays.asList("a", "b", "c").stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

