import java.util.*;

public class List {
    public static void main(String[] args) {
        java.util.List<String> list = Arrays.asList("Vietnam", "Japan", "US");

        /* Used to be... */
        for (String v : list) {
            System.out.println(v);
        }

        // Java 8 w/ Lambda
        list.forEach(v ->
                System.out.println(v)
        );

        // Java 8 w/ Stream API
        String[] array = {"Vietnam", "Japan", "US"};
        Arrays.stream(array).forEach( v ->
                System.out.println(v)
        );
    }
}

