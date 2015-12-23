import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Hello World
 */
public class J04Map {

    public static void main(String[] args) {

        Integer[] vals = {1, 2, 3, 4, 5};

        // map
        Arrays.stream(vals).map( x -> x * 2).forEach(
                System.out::println
        );

        // reduce
        int sum = Arrays.stream(vals).reduce((x, y) -> x + y).get();
        System.out.println("sum:" + sum);
    }
}

