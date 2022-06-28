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
        System.out.println("M1");
        System.out.println(columnsMatrix1);
        System.out.println(rowsMatrix1/columnsMatrix1);
        System.out.println("M2");
        System.out.println(columnsMatrix2);
        System.out.println(rowsMatrix2/columnsMatrix2);

        if (rowsMatrix1/columnsMatrix1 != rowsMatrix2){
            return null;
        }
        int[][] arr = new int[columnsMatrix1][rowsMatrix2/columnsMatrix2];



        return null;


    }
}
