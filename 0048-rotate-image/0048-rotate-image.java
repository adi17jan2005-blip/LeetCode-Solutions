class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //transpose of the matrix
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse each row
        for(int i=0;i<n;i++)
        {
            reverse(matrix[i]);
        }
        
        
    }
    //this is the reverse function
    public void reverse(int matrix[])
    {
        int j=matrix.length-1;
        int i=0;
        while(j>i)
        {
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
        
    }
}