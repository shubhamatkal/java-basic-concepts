import java.util.*;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class StreamCollectingExample {
    public static void main(String[] args) {
        // Creating a list of persons
        List<Person> people = Arrays.asList(
                new Person(1, "Alice"),
                new Person(2, "Bob"),
                new Person(3, "Alice"),
                new Person(4, "Charlie")
        );

        // Convert stream into an array
        String[] resultArray = people.stream()
                                     .map(Person::getName)
                                     .toArray(String[]::new);
        System.out.println("Array of names: " + Arrays.toString(resultArray));

        // Convert stream into a List
        List<String> nameList = people.stream()
                                      .map(Person::getName)
                                      .collect(Collectors.toList());
        System.out.println("List of names: " + nameList);

        // Convert stream into a Set (duplicates will be removed)
        Set<String> nameSet = people.stream()
                                    .map(Person::getName)
                                    .collect(Collectors.toSet());
        System.out.println("Set of names: " + nameSet);

        // Convert stream into a TreeSet (sorted order)
        TreeSet<String> nameTreeSet = people.stream()
                                            .map(Person::getName)
                                            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet of names: " + nameTreeSet);

        // Summarizing statistics on the lengths of names
        IntSummaryStatistics stats = people.stream()
                                           .collect(Collectors.summarizingInt(p -> p.getName().length()));
        System.out.println("Average name length: " + stats.getAverage());
        System.out.println("Max name length: " + stats.getMax());

        // Convert a stream into a Map (ID -> Name)
        Map<Integer, String> idToNameMap = people.stream()
                                                 .collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println("Map of IDs to Names: " + idToNameMap);

        // Grouping by name
        Map<String, List<Person>> nameToPeople = people.stream()
                                                       .collect(Collectors.groupingBy(Person::getName));
        System.out.println("Grouped by name: " + nameToPeople);

        // Partitioning by names that start with 'A'
        Map<Boolean, List<Person>> partitionedPeople = people.stream()
                                                             .collect(Collectors.partitioningBy(p -> p.getName().startsWith("A")));
        System.out.println("Partitioned by name starting with 'A': " + partitionedPeople);
    }
}
