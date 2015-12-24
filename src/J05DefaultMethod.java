import java.util.Arrays;

import static java.lang.System.out;

interface Person {
    default String fullName() {
        return "";
    }
}
class Developer implements Person {
    String first;
    String last;
    public Developer(String f, String l) {
        this.first = f;
        this.last = l;
    }
    @Override
    public String fullName() {
        return this.first + " " + this.last;
    }
}
class Computer implements Person {
}
public class J05DefaultMethod {
    public static void main(String[] args) {

        Arrays.asList(new Developer("David", "Jones"), new Computer())
                .stream()
                .forEach( p ->
                    out.println("My name is: " + p.fullName())
                );
    }
}

