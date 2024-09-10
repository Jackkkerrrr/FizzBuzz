
public class Multiples {
    public static void main(String[] args) {
//        int n = 0

        int n = 0;
        for (int i = 1; i < 1000; i++) {

            n = doFizzBuzz(i, n);
        }
        System.out.println(n);

    }

    public static int doFizzBuzz(int i, int n) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            n ++ ;

        } else if (divisibleBy3) {

            n ++ ;

        } else if (divisibleBy5) {

            n ++;

        }
        System.out.println(n);
        return n;
    }
}
