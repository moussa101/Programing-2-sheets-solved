package moussa;

public class m1 {
    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static int ArraySum(int[] a) {
        int Sum = 0;
        for (int i = 0; i < a.length; i++) {
            Sum += a[i];
        }
        return Sum;
    }

}
