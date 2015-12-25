import java.util.Arrays;

import static java.lang.System.out;

public class J12Stream {
    public static void main(String[] args) {

        // Sort, toString, [v]
        Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5, 9)
                .stream()
                .sorted()
                .map(String::valueOf)
                .map(s -> "[" + s + "]")
                .forEach(out::print);
    }
}


