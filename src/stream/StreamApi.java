package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        /*
1. What is the Java Stream API?
Answer: Stream API is introduced in Java 8, which allows functional-style operations on collections
(like filtering, mapping, and reducing). It processes data in a declarative way using pipelines.

2. Difference between Stream and Collection in Java?
Answer:Collection stores data, whereas Stream processes data.
        Stream does not store elements but provides a view of the collection and supports operations such as
        filtering, mapping, etc.

        4. What is the difference between map() and flatMap() in Stream?

    Answer:
        map() transforms each element into another object, maintaining a 1:1 relationship.
        flatMap() transforms each element into a stream of objects and flattens them into a single stream (1
        relationship).

        8. What are the key differences between forEach() and map()?

    Answer:
        forEach() is a terminal operation that performs an action on each element but doesn't return anything.
        map() is an intermediate operation that transforms each element and returns a stream.
         */
        // 3. How do you filter a list of objects using Streams?
        List<String> names = Arrays.asList("John", "Anna", "Mike");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        //5. What is the purpose of reduce() in Stream?
        // Answer: reduce() is used to combine the elements of a stream into a single result (e.g., sum, max, concatenation).
        int sum = Arrays.asList(1, 2, 3).stream().reduce(0, Integer::sum);

        //6. How do you sort a collection using Streams API?
        List<Integer> numbers = Arrays.asList(3, 1, 2);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        //7. How do you create an infinite stream using Stream.iterate()?
        //    Answer: Stream.iterate() generates an infinite sequence by applying a function repeatedly.
        Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);
        // 9. How can you convert a Stream to a Collection?
        //    Answer: You can collect elements from a stream into a collection using collect().
        List<Integer> list = Stream.of(1, 2, 3).collect(Collectors.toList());

//10. What are Lambda expressions, and how are they related to functional interfaces?
//    Answer: Lambda expressions are a concise way to express anonymous functions in Java.
//    They work with functional interfaces, which are interfaces with a single abstract method.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        numbers.forEach(n -> System.out.println(n));


    }
}
