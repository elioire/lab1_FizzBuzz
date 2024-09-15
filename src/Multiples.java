public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        int ann = 0;

        while (i <1000) {

            boolean mul3 = i % 3 == 0;
            boolean mul5 = i % 5 == 0;

            if (mul3 || mul5) {
                ann = ann + 1;
            }
            i++;
        }
        System.out.println(ann);
    }
}
