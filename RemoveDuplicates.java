import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Consumer;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Integer[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        Function<Integer[], Integer[]> removeDuplicates =
                a -> Arrays.stream(a)
                           .distinct()
                           .toArray(Integer[]::new);

        Consumer<Integer[]> print =
                a -> System.out.println(Arrays.toString(a));

        print.accept(removeDuplicates.apply(arr));
    }
}