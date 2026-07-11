import java.util.function.Function;
import java.util.function.Consumer;

public class ProductOfArray {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4};

        Function<Integer[], Integer> product = a -> {
            int result = 1;

            for (int num : a) {
                result *= num;
            }

            return result;
        };

        Consumer<Integer> print =
                p -> System.out.println("Product: " + p);

        print.accept(product.apply(arr));
    }
}