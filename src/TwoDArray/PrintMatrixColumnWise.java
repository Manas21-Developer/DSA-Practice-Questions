package TwoDArray;
import java.util.*;
public class PrintMatrixColumnWise {
    public void printMatrixColumnwise(int[][] mat, int n, int m) {
        // column wise printing here we fix column and move the row

        for (int j =0;j<m;j++) // this for column
        {
            for (int i =0;i<n;i++) // this for row
            {
                System.out.print(mat[i][j] +" "); // (0,0) , (1,0) , (2,0) ....
            }
        }
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int t;
            t = sc.nextInt();
            while (t > 0) {
                int n;
                int m;
                n = sc.nextInt();
                m = sc.nextInt();
                int[][] matrix = new int[n][m];
                for (int i = 0; i < n; i++)
                    for (int j = 0; j < m; j++)
                        matrix[i][j] = sc.nextInt();
                PrintMatrixColumnWise Obj = new PrintMatrixColumnWise();
                Obj.printMatrixColumnwise(matrix, n, m);
                System.out.println();
                t--;
            }
            sc.close();
        }
    }
}

