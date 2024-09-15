public class Reduce {

    public static void main(String[] args) {

        int num = 100;
        int steps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            }
            else if (num % 2 == 1) {
                num = num - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}