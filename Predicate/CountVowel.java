public class CountVowel {
    public static void main(String[] args) {
        String str = "programming";

        long count = str.toLowerCase()
                        .chars()
                        .filter(c -> "aeiou".indexOf(c) != -1)
                        .count();

        System.out.println("Vowels = " + count);
    }
}
