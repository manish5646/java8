import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Consumer;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {

        Integer[] arr = {10, 50, 20, 80, 30};

        Function<Integer[], Integer> smallest =
                a -> Arrays.stream(a)
                           .min(Integer::compare)
                           .get();

        Function<Integer[], Integer> secondSmallest =
                a -> Arrays.stream(a)
                           .distinct()
                           .sorted()
                           .skip(1)
                           .findFirst()
                           .get();

        Consumer<String> print = System.out::println;

        print.accept("Smallest Element: " + smallest.apply(arr));
        print.accept("Second Smallest Element: " + secondSmallest.apply(arr));
    }
}