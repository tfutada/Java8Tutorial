import java.util.Arrays;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Hello World
 */
public class Functional {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello World");
        new Thread(r).start();
    }
}


