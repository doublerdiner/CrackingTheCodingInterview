package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeroMatrixTest {

    ZeroMatrix zeroMatrix = new ZeroMatrix();

    @Test
    public void zeroMatrixTest(){
        int[][] matrix = new int[][]{{1,2,3}, {4,0,6}, {7,8,9}};
        int[][] answer = new int[][]{{1,0,3}, {0,0,0}, {7,0,9}};
        int[][] matrix2 = new int[][]{{0,1,2},{5,5,5},{7,7,7}};
        int[][] answer2 = new int[][]{{0,0,0},{0,5,5},{0,7,7}};
        assertEquals(answer, zeroMatrix.zeroCheck(matrix));
        assertEquals(answer2, zeroMatrix.zeroCheck(matrix2));
        int[][] blank = new int[][]{};
        assertEquals(blank, zeroMatrix.zeroCheck(blank));
    }

}
