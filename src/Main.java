public class Main {

    public static int [] [] Pascal (int n) {
        int[][] a = new int[n][];
         for(int i =0;i<n;i++){
             a[i] = new int [i+1];
             for (int j =0;j<a[i].length;j++){
                 if (j ==0|| j ==i)
                     a[i][j]=1;
                 else {
                     a[i][j]= a[i-1][j]+ a[i-1][j-1];
                 }
             }
         }
         return a;
    }
    public static void main(String[] args) {

        int [][] b = new int [4][];

        for (int i =0;i<b.length;i++){
            if (i ==0)
                b[i]= new int [1];
            else {
              b[i] = new int [3];
            }
        }
        int [] [] a = new int [4][];
        int sum =1;
        for (int i =0;i<a.length;i++){
            a[i] = new int[i+1];
            for (int j =0;j<a[i].length;j++){
                a[i][j]=sum;
                sum++;
            }
        }
        MatrixSum.display(Pascal(5));


}
}