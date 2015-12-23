import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

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

        // filter
        Arrays.stream(vals).filter(x -> x % 2 == 0).forEach(
                System.out::println
        );
        // Collect
        List<Integer> ret =
                Arrays.stream(vals).filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("New list: " + ret);
    }
}

