import Contract.Lambda.Maker;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import Service.SomeService;

class Main {
    public static void main(String[] args) {
        Maker<Integer> maker = (number) -> "BAR: " + number;
        System.out.println(maker.make(100));

        Maker<String> makerString = (someString) -> "FOF: " + someString;
        System.out.println(makerString.make("FOF"));

        Predicate<Integer> isPositive = (someInteger) -> {
            return someInteger > 0;
        };
        System.out.println(String.format(
            "Is 10 positive: %s",
            isPositive.test(10) ? "Yes" : "No"
        ));

        BinaryOperator<String> merge = (String foo, String bar) -> {
            return foo + bar;
        };
        System.out.println(String.format(
            "John Doe merged: %s",
            merge.apply("John", "Doe")
        ));

        UnaryOperator<String> stringToJson = (data) -> {
            return String.format("{\"%s\"}", data);
        };
        System.out.println(String.format(
            "John Doe as json: %s",
            stringToJson.apply("John Doe")
        ));

        Function<Map<String, String>, String> mapToJson = (map) -> {
            return map.entrySet()
                .stream()
                .map((item) -> {
                    return String.format(
                        "\"%s\":\"%s\"",
                        item.getKey(),
                        item.getValue()
                    );
                }).collect(Collectors.joining(",", "{", "}"));
        };
        System.out.println(String.format(
            "Map to json: %s",
            mapToJson.apply(Map.of("q", "w", "e", "r", "b", "d"))
        ));

        Supplier<SomeService> someServicesSupplier = () -> {
            return new SomeService();
        };

        Consumer<SomeService> runEverything = (service) -> {
            service.foo();
            service.bar();
        };
        runEverything.accept(someServicesSupplier.get());
    }
}
