package LeetCodeSolutions;

/**
 * Created by AndrewX on 2017/1/16.
 * This is a naive implementation. The space complexity can be further reduced.
 * size[i][j] records the maximum size of square that contains [i][j] as the bottom-left corner.
 */
public class Q221_Maximal_Square {
    public static int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        if (rows==0){
            return 0;
        }
        int columns = matrix[0].length;
        int result = 0;
        int[][] size = new int[rows][columns];
        for(int i=0;i<rows;i++){
            size[i][0]=matrix[i][0]-'0';
            result=Math.max(result, size[i][0]);
        }
        for(int j=0;j<columns;j++){
            size[0][j]=matrix[0][j]-'0';
            result=Math.max(result, size[0][j]);
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<columns;j++){
                if(matrix[i][j]=='1'){
                    size[i][j]=Math.min(Math.min(size[i-1][j], size[i][j-1]), size[i-1][j-1])+1;
                    result=Math.max(result, size[i][j]);
                }
            }
        }
        return result*result;
    }
}
