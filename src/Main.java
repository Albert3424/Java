import Base.Order;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception
    {
        List<Order> orders = Arrays.asList(
                new Order("Smartphone", "Electronics", 800),
                new Order("Table", "Furniture", 1500),
                new Order("Laptop", "Electronics", 300),
                new Order("Keyboard", "Electronics", 100),
                new Order("Chair", "Furniture", 200)
        );

        Optional<Double> averagePrice = orders.stream()
                .filter(o -> "Electronics".equals(o.getCategory()))
                .sorted(Comparator.comparingDouble(Order::getPrice).reversed())
                .limit(3)
                .map(Order::getPrice)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.size() < 3
                                ? Optional.<Double>empty()
                                : Optional.of(list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0))
                ));

        System.out.println(averagePrice);
    }
}
