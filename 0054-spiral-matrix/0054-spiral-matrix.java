class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        ArrayList<Integer> ls=new ArrayList<>();


        while(top<=bottom && left<=right){
        //for going right
        for(int i=left; i<=right; i++)
        {
            ls.add(matrix[top][i]);
        }
        top++;

        //for goind bottom
        for(int i=top; i<=bottom;i++)
        {
            ls.add(matrix[i][right]);
        }
        right--;;

        //for going left
        if(top<=bottom){
        for(int i=right; i>=left;i--)
        {
            ls.add(matrix[bottom][i]);
        }
        bottom--;}

        //for going top
        if(left<=right){
        for(int i=bottom; i>=top;i--)
        {
            ls.add(matrix[i][left]);
        }
        left++;
        }
        }
        
        return ls;

        
    }
}