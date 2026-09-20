class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int a=26;
        int product=0;
        int sum=0;
        for(int i=97;i<=122;i++)
        {
            map.put((char)i,a);
            a--;
        }

        for(int i=0;i<s.length();i++)
        {
            product=(map.get(s.charAt(i)))*(i+1);
            sum=sum+product;
    
        }
        return sum;

        
    }
}