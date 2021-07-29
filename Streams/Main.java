import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;
import Entity.Product;
import java.util.stream.Collectors;
import java.util.function.Supplier;
import java.util.stream.IntStream;

class Main {

  public static ArrayList<Product> makeProducts(int count) {
    ArrayList<Product> list = new ArrayList<Product>(count);
    for (int i = 0; i < count; i++) {
      list.add(new Product("foo" + i, i));
    }
    return list;
  }

  public static void main(String[] args) {

    Supplier<IntStream> ratingStream = () -> {
      return makeProducts(10).stream()
          .filter(product -> product.getRating() > 0)
          .map(product -> product.setRating(product.getRating() * 2))
          .sorted(Product::compareTo)
          .mapToInt(Product::getRating)
          .takeWhile(rating -> rating < 10)
          .distinct();
    };

    ratingStream.get().forEach(System.out::println);

    System.out.println(String.format(
        "Rating with value of 7 included: %s\nAll ratings are longer then 5: %s\nNo zero-values detected: %s",
        ratingStream.get().anyMatch(rating -> rating == 7) ? "Yes" : "No",
        ratingStream.get().allMatch(rating -> rating > 5) ? "Yes" : "No",
        ratingStream.get().noneMatch(rating -> rating == 0) ? "Yes" : "No"
    ));

    var ratingStatistics = ratingStream.get().summaryStatistics();
    System.out.println(String.format(
        "Average rating: %s, Max rating: %s, Min rating: %s, Ratings all together: %s, Ratings count: %s",
        ratingStatistics.getAverage(),
        ratingStatistics.getMax(),
        ratingStatistics.getMin(),
        ratingStatistics.getSum(),
        ratingStatistics.getCount()
    ));

    System.out.println(String.format(
        "Stream's first element: %s\nStream's random element: %s",
        ratingStream.get().findFirst().getAsInt(),
        ratingStream.get().findAny().getAsInt()
    ));

    System.out.println(String.format(
        "Ratings factorial: %s",
        ratingStream.get().reduce((prev, next) -> prev * next).getAsInt()
    ));
  }
}