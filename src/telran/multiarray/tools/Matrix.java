package telran.multiarray.tools;

public class Matrix {
    public static int sum(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        System.out.println(total);
        return total;

    }


    public static int[][] transp(int[][] matrix) {
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // TODO
        return null;
    }
}
