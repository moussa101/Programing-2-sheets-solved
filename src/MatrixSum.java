public class MatrixSum {

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

        public static void display(int[][] a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
        public static void display(int[][][] a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    for (int k = 0; k < a[i][j].length; k++) {
                        System.out.print(a[i][j][k]);
                    }
                    System.out.println();
                }
                System.out.println();
            }


        }
        public static  int [][] MatrixSum(int [][]a, int [][]b) {
            if (a.length != b.length || a[0].length != b[0].length) {
                throw new IllegalArgumentException("Matrices must have the same dimensions");
            }
            int [][]c = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    c[i][j]= a[i][j]+b[i][j];
                }

            }

            return c;
        }
        public static boolean isMatrixSum(int [][]a, int [][]b, int [] [] c) {
            if (a.length != b.length || a.length != c.length || a[0].length != b[0].length || a[0].length != c[0].length)
                return false;

            int [][]m = MatrixSum(a,b);
            for (int i = 0;i<m.length;i++){
                for (int j = 0;j<m[i].length;j++){
                    if (c[i][j]!=m[i][j])
                        return false;
                }
            }
            return true;

        }

        public static void display(String[][] a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {

        int[][] a = {{1,1,1,1,1},{1,1,1,1,1}};
        int[][] b = {{1,1,1,1,1},{1,1,1,1,1}};
        int[][] c = {{2,2,2,2,2},{2,2,2,2,2}};
        int[][][] m ={{{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2}}};
        display(MatrixSum(a,b));
        System.out.println(isMatrixSum(a,b,c));
        display(m);
    }

}



