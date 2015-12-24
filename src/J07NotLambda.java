import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.List;
/**
 * Hello World
 */
public class J07NotLambda {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int x = 2;
        //x = 3; // cannot be modified
        list.forEach( v ->
                System.out.println(v * x)
        );
    }
}

