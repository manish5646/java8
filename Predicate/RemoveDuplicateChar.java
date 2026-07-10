

public class RemoveDuplicateChar {
  
    public static void main(String[] args) {
        String str = "programming";

        String result = str.chars()
                           .distinct()
                           .collect(StringBuilder::new,
                                    StringBuilder::appendCodePoint,
                                    StringBuilder::append)
                           .toString();

        System.out.println(result);
    }
}

