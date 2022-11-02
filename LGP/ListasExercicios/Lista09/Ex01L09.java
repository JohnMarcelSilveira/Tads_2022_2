public class Ex01L09 {
    public static void main(String[] args) {
        int[][] a, b, c;
        a = new int[][] { { 0, 1, 2 }, { 4, 0, 1 } };
        b = new int[][] { { 4, 2, 3 }, { 3, 5, 9 } };
        c = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}