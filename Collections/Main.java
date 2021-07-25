import Service.*;
import java.util.*;
import Item.*;
import java.io.IOException;

class Main {

    public static void tryingOutDeque() {
        var dequeServiceItems = new ArrayDeque<StringItem>(3);
        dequeServiceItems.push(new StringItem("Foo"));
        dequeServiceItems.push(new StringItem("Bar"));
        dequeServiceItems.push(new StringItem("Baz"));

        var dequeService = new DequeService<StringItem>(dequeServiceItems);

        var additionToItems = "__test";
        dequeService
                .fromEnd()
                .map((item) -> {
                    item.setValue(item.getValue() + additionToItems);
                });
        System.out.println(dequeService.getCollection());
    }

    public static void tryingOutList() {
        var listServiceItems = new ArrayList<IntegerItem>(3);
        listServiceItems.add(new IntegerItem(2));
        listServiceItems.add(new IntegerItem(1));
        listServiceItems.add(new IntegerItem(3));

        var listService = new ListService<IntegerItem>(listServiceItems);

        System.out.println("\nSorted:");
        listService
                .sort()
                .map((item) -> System.out.println(item.getValue()));

        System.out.println("\nReversed:");
        listService
                .reverse()
                .map((item) -> System.out.println(item.getValue()));
    }

    public static void tryingOutConfig() throws InvalidPropertiesFormatException, IOException {
        var configService = new ConfigService("config.properties");

        System.out.println(configService.get("test2"));
    }

    public static void main(String[] args) {
        System.out.println("\nDeque:");
        tryingOutDeque();
        System.out.println();

        System.out.println("\nList:");
        tryingOutList();
        System.out.println();

        System.out.println("\nConfig:");
        try {
            tryingOutConfig();
        } catch (InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}