public class Pascal {
    public static void main(String[] args) {

        int [] [] a = new int[5][];
        for (int i = 0; i <a.length ; i++) {
            a[i] = new int[ i+1];
            for (int j = 0; j < a[i].length ; j++) {
                if (j==0 || j==a[i].length-1){
                    a[i][j] =1;
                }
                else {
                    a[i][j]= a[i-1][j]+a[i][j-1];
                }
            }
        }
        Linear_Algebra.display(a);

    }
}
