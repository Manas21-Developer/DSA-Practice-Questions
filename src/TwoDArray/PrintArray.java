package  TwoDArray;

class PrintArray{
    public void printElements(int[][] arr , int n  , int m) {
        for(int i =0;i<n;i++)
        {
            for (int j=0;j<m ;j++)
            {
                System.out.print(arr[i][j] +" ") ;
            }
            System.out.println();
        }
    }
}