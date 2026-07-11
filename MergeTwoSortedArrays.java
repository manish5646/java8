import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 3, 5, 7};
        Integer[] arr2 = {2, 4, 6, 8};

        Predicate<Integer[][]> isValid =
                a -> a[0] != null && a[1] != null;

        Function<Integer[][], Integer[]> merge = arrays -> {
            Integer[] a = arrays[0];
            Integer[] b = arrays[1];

            Integer[] result = new Integer[a.length + b.length];

            int i = 0, j = 0, k = 0;

            while (i < a.length && j < b.length) {
                result[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
            }

            while (i < a.length) result[k++] = a[i++];
            while (j < b.length) result[k++] = b[j++];

            return result;
        };

        Consumer<Integer[]> print =
                a -> System.out.println(Arrays.toString(a));

        Integer[][] arrays = {arr1, arr2};

        if (isValid.test(arrays)) {
            print.accept(merge.apply(arrays));
        }
    }
}