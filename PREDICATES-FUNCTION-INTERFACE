import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
       //number is even or Odd
        Predicate<Integer> predicate1 = t -> t % 2 == 0;
        System.out.println(predicate1.test(20));

        //length of character is divisible by 2 or not

        Predicate<String> predicate2 = name -> name.length() % 2 == 0;
        System.out.println(predicate2.test("manish"));

        //age is greater than or lesser than 18

        Predicate<Integer> predicate3 = age -> age >= 18;
        System.out.println(predicate3.test(24));

        //  finding the perfect square 

        Predicate<Integer> predicate4 = n -> {
            if (n < 0)
                return false;

            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        System.out.println(predicate4.test(64));
    }
}
