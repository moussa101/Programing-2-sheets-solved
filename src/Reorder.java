import java.util.*;

public class Reorder {
    public static int ArraySum(int[] a) {
        int Sum = 0;
        for (int i = 0; i < a.length; i++) {
            Sum += a[i];
        }
        return Sum;
    }


    public static int[] SumArr(int[][] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = ArraySum(a[i]);
        }
        return b;
    }

    public static int[] SortedArrIndex(int[][] a) {
        int[] b = SumArr(a);
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (b[j] > b[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = c[maxIndex];
            c[maxIndex] = c[i];
            c[i] = temp;

            int tempSum = b[maxIndex];
            b[maxIndex] = b[i];
            b[i] = tempSum;
        }
        return c;
    }


    public static void reorder ( int[][] a){
        int []b = SortedArrIndex(a);
         for (int i=0;i<a.length;i++){
             System.out.println(Arrays.toString(a[b[i]]));
         }


        }
        public static void main (String[]args){

            int[][] a = {{1}, {1, 1, 1, 1, 1}, {1, 1, 1}, {1, 1}};
            System.out.println(Arrays.toString(SortedArrIndex(a)));
            reorder(a);

        }
}
