import java.util.*;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindDuplicatesNumber {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        Function<Integer[], List<Integer>> duplicates =
                a -> Arrays.stream(a)
                           .filter(n -> Collections.frequency(Arrays.asList(a), n) > 1)
                           .distinct()
                           .collect(Collectors.toList());

        Consumer<List<Integer>> print =
                list -> System.out.println("Duplicates: " + list);

        print.accept(duplicates.apply(arr));
    }
}