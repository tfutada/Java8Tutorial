import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.List;
import static java.lang.System.out;

/**
 * Hello World
 */
public class J07NotLambda {

    public static void main(String[] args) {

        Supplier<Integer> f1 = createCounter();
        out.println(f1.get());
        out.println(f1.get());
    }

    public static Supplier<Integer> createCounter() {
        int counter = 0;
        return () -> counter;
//        return () -> counter++;
    }
}

