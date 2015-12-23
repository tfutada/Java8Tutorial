import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Hello World
 */
public class Lambda {

    public static void main(String[] args) {

        // Function
        Function<Integer, Integer> f = x -> x * 2;
        System.out.println("Result:" + f.apply(3));

        // Supplyer
        generator(() -> "Hello");

        // Consumer
        java.util.List<String> list = Arrays.asList("Vietnam", "Japan", "US");
        Consumer<String> lambda = v -> System.out.println(v);
        list.forEach(lambda);
    }

    // Supplier
    public static void generator(Supplier<String> f) {
        System.out.println(f.get());
    }
}

