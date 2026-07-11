import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class MissingNumber {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 5};

        Predicate<Integer[]> isValid =
                a -> a != null && a.length > 0;

        Function<Integer[], Integer> findMissing = a -> {
            int n = a.length + 1;

            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;

            for (int num : a) {
                actualSum += num;
            }

            return expectedSum - actualSum;
        };

        Consumer<Integer> print =
                num -> System.out.println("Missing Number: " + num);

        if (isValid.test(arr)) {
            print.accept(findMissing.apply(arr));
        }
    }
}