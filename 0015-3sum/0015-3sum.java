class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet <List<Integer>> st=new HashSet<>();
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                int required= -(nums[i]+nums[j]);
                
                    if(map.containsKey(required))
                    {
                        int k=map.get(required);
                        if(k!=j && k!=i){ 
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        st.add(temp);

                        }
                       
                    }
                
            }
        }
        ans.addAll(st);
        return ans;
        
        
    }
}