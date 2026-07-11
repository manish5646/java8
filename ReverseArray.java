import java.util.Arrays;
import java.util.function.Function;

public class ReverseArray {
    public static void main(String[] args) {

        Integer[] arr = {10, 20, 30, 40, 50};

        Function<Integer[], Integer[]> reverse =
                a -> java.util.stream.IntStream.range(0, a.length)
                        .mapToObj(i -> a[a.length - 1 - i])
                        .toArray(Integer[]::new);

        System.out.println(Arrays.toString(reverse.apply(arr)));
    }
}