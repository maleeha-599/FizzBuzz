public class Multiples {
    public static void main(String[] args) {
        int i = 0;

        for (int z = 1; z < 1000; z++) {
            boolean divisibleBy3 = z % 3 == 0;
            boolean divisibleBy5 = z % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                i = i + 1;
            }
            else if (divisibleBy3) {
                i = i + 1;
            }
            else if (divisibleBy5) {
                i = i + 1;
            }
        }

        System.out.print(i);
    }
}
