import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    record User(String name, int age) {}

    public static void main(String[] args)
    {
        List<User> users = List.of(
                new User("Bob", 17),
                new User("Mila", 22),
                new User("Ilya", 31),
                new User("Anna", 17)
        );

        Map<Integer, List<User>> grouped = users.stream().collect(Collectors.groupingBy(User::age));

        grouped.entrySet().stream().max(Comparator.comparingInt(entry -> entry.getValue().size())).ifPresent(entry -> {
                    int age = entry.getKey();
                    String names = entry.getValue().stream()
                            .map(User::name)
                            .collect(Collectors.joining(", "));

                    System.out.println("Возрастная группа: " + age);
                    System.out.println("Люди в группе: " + names);
                });
    }
}
