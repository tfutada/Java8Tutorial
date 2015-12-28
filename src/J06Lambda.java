import java.util.*;
import static java.lang.System.out;

public class J06Lambda {
    public static void main(String[] args) {

        java.util.List<String> list = Arrays.asList("Vietnam", "Japan", "US");

        // Used to be...
        for (String v : list) {
            out.println(v + " ");
        }

        // Java 8 w/ Lambda
        list.forEach(v ->
                out.println(v + " ")
        );

        // w/ Method Reference ::
        list.forEach(
                out::println
        );

        // w/ Stream API
        String[] a = {"Vietnam", "Japan", "US"};
        Arrays.stream(a).forEach(
                out::println
        );

        // replaceAll(). Method that takes a lambda
        list.replaceAll( String::toUpperCase );
        out.println("toUpper:" + list);
    }
}

