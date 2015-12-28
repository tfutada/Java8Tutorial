
/**
 * Hello World
 */
public class J08FunctionalIF {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello World");
        new Thread(r).start();
    }
}



