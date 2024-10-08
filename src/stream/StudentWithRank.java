package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentWithRank {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", 1),
                new Student(2, "Bob", 2),
                new Student(3, "Charlie", 1),
                new Student(4, "David", 3)
        );

        // Convert list to map (rank -> name)
        Map<Integer, List<String>> rankToNameMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::rank,
                        Collectors.mapping(Student::name, Collectors.toList())
                ));

        // Convert list to map (rank -> name)
        Map<Integer, List<Student>> rankToStudentMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::rank));

        // Print the map
        rankToNameMap.forEach((rank, names) ->
                System.out.println("Rank: " + rank + " -> " + names)
        );

        // Print the map with student
        rankToStudentMap.forEach((rank, studentList) -> {
            System.out.println("Rank: " + rank);
            studentList.forEach(System.out::println);
        });
    }
}
record Student(int id, String name, int rank) {}
