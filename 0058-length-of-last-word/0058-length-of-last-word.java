class Solution {
    public int lengthOfLastWord(String s) {
        
        String res=s.trim();
        int j = res.length();
        for(int i=j-1;i>0;i--){
            if(res.charAt(i)==' '){
                return j-1-i;
            }
        }
return j;
    }
}
