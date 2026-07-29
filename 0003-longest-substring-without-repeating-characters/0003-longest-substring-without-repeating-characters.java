class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet <Character> hs=new HashSet<>();
            int c=0;
            for(int j=i;j<s.length();j++){
                if(hs.add(s.charAt(j))){
                    c++;
                    if(c>max){
                        max=c;
                    }
                }
                else 
                break;
            }
        }
        return max;
    }
}