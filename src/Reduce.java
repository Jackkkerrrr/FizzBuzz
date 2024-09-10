public class Reduce {
    public static void main(String[] args) {

        int i = 100;
        int steps = 0;
        boolean iseven = i % 2 == 0;
        boolean isodd = i % 2 != 0;
        while (i > 0) {
            if (iseven) {
                i = i / 2;
            } else if (isodd) {
                i = i - 1;
            }
            steps = steps + 1;
        }
        System.out.println(steps);
    }
}
