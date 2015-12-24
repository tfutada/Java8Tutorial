import java.util.Arrays;
import java.util.function.Predicate;

import static java.lang.System.out;

public class J10Predicate {

    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter( v -> v % 2 == 0)
                .forEach(
                        out::println
                );

        // Declare a Predicate
        Predicate<Integer> p = v -> v % 2 == 0;

        Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter( p )
                .forEach(
                        out::println
                );

    }
}



