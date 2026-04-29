class Solution {
    public int searchInsert(int[] nums, int target) {
        int last=nums.length-1;
        int first=0;
       int mid =0;
        while(last>=first){
            mid=(last+first)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(target<nums[mid]){
                    last=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
        }
      return first;
    }
}