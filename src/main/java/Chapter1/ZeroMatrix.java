package Chapter1;

public class ZeroMatrix {
    public int[][] zeroCheck(int[][] matrix) {
        if(matrix.length == 0){
            return matrix;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int currentInt = matrix[i][j];
                if(currentInt == 0){
                    for(int a=0; a<n; a++){
                        matrix[i][a] = 0;
                    }
                    for(int b=0; b<m; b++){
                        matrix[b][j] = 0;
                    }
                    return matrix;
                }
            }
        }
        return matrix;
    }
}
