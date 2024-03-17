public class Linear_Algebra {

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
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

    public static int[][] MatrixSum(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }

        }

        return c;
    }

    public static boolean isMatrixSum(int[][] a, int[][] b, int[][] c) {
        if (a.length != b.length || a.length != c.length || a[0].length != b[0].length || a[0].length != c[0].length)
            return false;

        int[][] m = MatrixSum(a, b);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (c[i][j] != m[i][j])
                    return false;
            }
        }
        return true;

    }

    public static int[][] Transpsoe(int[][] a) {

        int[][] b = new int[a.length][];
        int c = 0;
        for (int i = a.length-1; i >=0; i--) {
            b[c] = new int[a[i].length];
            c++;
        }
        int m =0;
        for (int i = a.length-1; i >=0; i--) {
            int f =0;
            for (int j = a[i].length-1; j>=0; j--) {
                b[m][f]= a[i][j];
               f++;
            }
            m++;
        }
        return b;
    }

    public static void display(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


    public static int [][] Pascal(int n){
        int[][] a = new int[5][];
        for(int i = 0; i<a.length;i++){
        a[i] = new int[i + 1];
        for (int j = 0; j < a[i].length; j++) {
            if (j == 0 || j == a[i].length - 1) {
                a[i][j] = 1;
            } else {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
        }
    }
        return a;
}

    public static void main(String[] args) {

        int[][] a = {{1,1,1,1,1},{1,1,1,1,1}};
        int[][] b = {{1,1,1,1,1},{1,1,1,1,1}};
        int[][] c = {{2,2,2,2,2},{2,2,2,2,2}};
        int[][][] m ={{{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2}}};

        display(Transpsoe(Pascal(5)));
    }

}



