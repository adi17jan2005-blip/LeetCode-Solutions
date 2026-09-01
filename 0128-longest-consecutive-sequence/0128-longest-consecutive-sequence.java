class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        int x=0;
        int maxlength=0;
        int length=0;
        HashSet <Integer> st=new HashSet<>();
        for(int i=0; i<n; i++)
        {
            st.add(nums[i]);
        }

        for(int it:st)
        {
            if(!st.contains(it-1)){
                length=1;
                x=it;

                while(st.contains(x+1))
                {
                    x++;
                    length++;
                }
                maxlength=Math.max(length,maxlength);
            }

        }
        return maxlength;
    }
}