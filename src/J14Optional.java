import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

public class J14Optional {
    public static void main(String[] args) {

        // Create an Optional that contains a String
        Optional<String> david = Optional.of("David");

        // Create an empty Optional.
        Optional<String> bogus = Optional.empty();

        // Optional.orElse()
        out.println(bogus.orElse("Empty"));

        // Stream to iterate through the two Optionals.
        Arrays.asList(david, bogus).stream().forEach( o ->
                // if exists, unwrap it and pass it to the lambda.
                o.ifPresent( v ->
                        out.println("I am :" + v)
                )
        );
    }
}


