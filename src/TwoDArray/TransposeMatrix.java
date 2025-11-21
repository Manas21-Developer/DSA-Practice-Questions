package TwoDArray;

public class TransposeMatrix {
    public int[][] matrixTranspose(int[][] mat, int n) {
        for (int i =0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                swap(mat,i,j,j,i);
            }
        }return mat;
    }
    public static void swap (int [][] arr , int i , int j , int k , int l )
    {
        int temp = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = temp;
    }
}
