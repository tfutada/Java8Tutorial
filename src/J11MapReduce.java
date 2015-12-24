import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import static java.lang.System.out;

/**
 * Hello World
 */
public class J11MapReduce {

    public static void main(String[] args) {

        // map : x -> x * 2
        Arrays.asList(1, 2, 3, 4, 5).stream()
                .map( x -> x * 2).forEach(
                    out::println
        );

        // reduce : (x, y) -> x + y
        int sum = Arrays.asList(1, 2, 3, 4, 5).stream()
                .reduce((x, y) -> x + y).get();
        out.println("sum: " + sum);

        // filter : x -> x % 2 == 0
        Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(x -> x % 2 == 0).forEach(
                    out::println
                );

        // collect : toList()
        List<Integer> ret = Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        out.println("New list: " + ret);
    }
}

