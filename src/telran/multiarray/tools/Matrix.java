package telran.multiarray.tools;

public class Matrix {
    public static int sum(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
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
        int columnsMatrix1 = 0;
        int rowsMatrix1 = 0;
        int columnsMatrix2 = 0;
        int rowsMatrix2 = 0;
        for (int i = 0; i < matrix1.length; i++) {
            columnsMatrix1++;
            for (int j = 0; j < matrix1[i].length; j++) {
                rowsMatrix1++;
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            columnsMatrix2++;
            for (int j = 0; j < matrix2[i].length; j++) {
                rowsMatrix2++;
            }
        }

        int counter = 0;
        if (rowsMatrix1 / columnsMatrix1 != columnsMatrix2) {
            return null;
        }
        int[][] arr = new int[columnsMatrix1][rowsMatrix2 / columnsMatrix2];
        int temp = 0;

        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix2[i].length; k++) {

                for (int j = 0; j < matrix1[i].length; j++) {
                    temp += matrix1[i][j] * matrix2[j][k];
                }

                arr[i][k] = temp;
                temp = 0;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------");

        return arr;
    }
}
