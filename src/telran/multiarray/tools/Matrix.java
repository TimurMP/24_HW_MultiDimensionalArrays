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
        int columns = 0;
        int rows = 0;
        for (int i = 0; i < matrix.length; i++) {
            columns++;
            for (int j = 0; j < matrix[i].length; j++) {
                rows++;
            }
        }
        int[][] arr = new int[rows / columns][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[j][i] = matrix[i][j];
            }

        }
        return arr;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // TODO
        return null;
    }
}
