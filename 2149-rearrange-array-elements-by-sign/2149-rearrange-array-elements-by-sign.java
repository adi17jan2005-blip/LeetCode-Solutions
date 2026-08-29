class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int positive []=new int[n/2];
        int negative []=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                positive[j]=nums[i];
                j++;
            }
            else 
            {
            negative[k]=nums[i];
            k++;
            }
        }

        for(int i=0;i<n/2;i++)
        {
            nums[i*2]=positive[i];
            nums[i*2+1]=negative[i];
        }
        return nums;
        
    }
}