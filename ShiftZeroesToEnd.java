import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class ShiftZeroesToEnd {
    public static void main(String[] args) {

        Integer[] arr = {1, 0, 2, 0, 3, 0, 4};

        Predicate<Integer[]> isValid =
                a -> a != null && a.length > 0;

        Function<Integer[], Integer[]> shiftZeroes = a -> {
            Integer[] result = new Integer[a.length];
            int index = 0;

            for (int num : a) {
                if (num != 0) {
                    result[index++] = num;
                }
            }

            while (index < a.length) {
                result[index++] = 0;
            }

            return result;
        };

        Consumer<Integer[]> print =
                a -> System.out.println(Arrays.toString(a));

        if (isValid.test(arr)) {
            print.accept(shiftZeroes.apply(arr));
        }
    }
}