package telran.multiarray.tests;

import org.junit.jupiter.api.Test;
import telran.multiarray.tools.Matrix;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {

    int[][] matrix1 = {{1, 2, 3}}; // 1x3
    int[][] matrix2 = {{1}, {2}, {3}};// 3x1
    int[][] matrix3 = {{1, 2, 3}, {3, 2, 1}, {2, 1, 3}};// 3x3
    int[][] matrix3Ex = {{1, 3, 2}, {2, 2, 1}, {3, 1, 3}};// 3x3

    int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}};// 2x3
    int[][] matrix4Ex = {{1, 4}, {2, 5}, {3, 6}};// 2x3

    @Test
    void testSum() {
        assertEquals(6, Matrix.sum(matrix1));
        assertEquals(6, Matrix.sum(matrix2));
        assertEquals(18, Matrix.sum(matrix3));
    }

    @Test
    void testTransp() {
        assertArrayEquals(matrix2, Matrix.transp(matrix1));
        assertArrayEquals(matrix3, Matrix.transp(matrix3Ex));
        assertArrayEquals(matrix4, Matrix.transp(matrix4Ex));


    }

    @Test
    void testMultiply() {
        Matrix.multiply(matrix4, matrix4Ex);
        int[][] expected = {{14}};
        assertArrayEquals(expected, Matrix.multiply(matrix1, matrix2));
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 4}, {2, 5}, {3, 6}};
        int[][] arrExpected = {{14, 32}, {32, 77}};
        assertArrayEquals(arrExpected, Matrix.multiply(arr1, arr2));
    }


}