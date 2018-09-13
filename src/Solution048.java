/**
 * 48. 旋转图像
 * Created by nanca on 9/13/2018.
 */
public class Solution048 {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int j=0;j<matrix[0].length/2;j++){
            for(int i=0;i<matrix.length;i++){
                swap(matrix,i,j,i,matrix.length-1-j);
            }
        }
    }

    public void swap(int[][] nums,int i,int j,int m,int n){
        int temp = nums[i][j];
        nums[i][j] = nums[m][n];
        nums[m][n] = temp;
    }

}
