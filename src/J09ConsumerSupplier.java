import java.util.Arrays;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Hello World
 */
public class J09ConsumerSupplier {

    public static void main(String[] args) {

        // Function
        Function<Integer, Integer> f = x -> x * 2;
        System.out.println("Result: " + f.apply(3));

        // Supplier
        System.out.println("repeat: " + repeat(3, "bye").get());

        // Consumer
        Consumer<String> lambda = System.out::println;
        Arrays.asList("Vietnam", "Japan", "US").forEach(lambda);

        // BiFunction
        BiFunction<String, String, String> f2 = (a, b) -> a + " " + b;
        System.out.println("Concat: " + f2.apply("Hello", "World"));
    }

    // returns a Supplier
    public static Supplier<String> repeat(int c, String s) {
        return () -> String.join("", Collections.nCopies(c, s));
    }
}

