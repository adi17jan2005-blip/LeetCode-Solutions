/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        int matrix[][] =new int[m][n];
        ArrayList<Integer> ls=new  ArrayList<>();
        for( int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=-1;
            }
        }
        


        while(head!=null &&top<=bottom && left<=right){
        //for going right
        for(int i=left; i<=right && head!=null; i++)
        {
            matrix[top][i]=head.val;
            head=head.next;
        }
        top++;

        //for goind bottom
        for(int i=top; i<=bottom && head!=null;i++)
        {
            matrix[i][right]=head.val;
            head=head.next;
        }
        right--;

        //for going left
        if(top<=bottom){
        for(int i=right; i>=left && head!=null;i--)
        {
            matrix[bottom][i]=head.val;
            head=head.next;
        }
        bottom--;}

        //for going top
        if(left<=right){
        for(int i=bottom; i>=top && head!=null;i--)
        {
            matrix[i][left]=head.val;
            head=head.next;
        }
        left++;
        }
        }
        
        return matrix;

        
    }
}