class Solution {
    public int[][] generateMatrix(int n) {
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int k=0;
        int matrix[][] =new int [n][n];
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=1 ;i<=n*n;i++)
        {
            ls.add(i);
        }


        while(top<=bottom && left<=right){
        //for going right
        for(int i=left; i<=right; i++)
        {
           matrix[top][i]=ls.get(k);
           k++;
        }
        top++;

        //for goind bottom
        for(int i=top; i<=bottom;i++)
        {
            matrix[i][right]=ls.get(k);
            k++;
        }
        right--;;

        //for going left
        if(top<=bottom){
        for(int i=right; i>=left;i--)
        {
            matrix[bottom][i]=ls.get(k);
            k++;
        }
        bottom--;}

        //for going top
        if(left<=right){
        for(int i=bottom; i>=top;i--)
        {
            matrix[i][left]=ls.get(k);
            k++;
        }
        left++;
        }
        }
        
        
return matrix;
        
    }
}