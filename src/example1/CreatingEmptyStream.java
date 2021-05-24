package example1;

import java.util.stream.Stream;

public class CreatingEmptyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}
