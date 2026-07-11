import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class MidElementSort {
    public static void main(String[] args) {

        Integer[] arr = {8, 5, 7, 4, 2, 1};

        Predicate<Integer[]> condition = a -> {
            int mid = a.length / 2 - 1;
            return a[mid] >= a[mid + 1];
        };

        Function<Integer[], Integer[]> sortLeft = a -> {
            int mid = a.length / 2 - 1;

            Integer[] result = Arrays.copyOf(a, a.length);

            Arrays.sort(result, 0, mid + 1);

            return result;
        };

        Consumer<Integer[]> print =
                a -> System.out.println(Arrays.toString(a));

        if (condition.test(arr)) {
            print.accept(sortLeft.apply(arr));
        } else {
            print.accept(arr);
        }
    }
}