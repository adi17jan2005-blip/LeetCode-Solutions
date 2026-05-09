class Solution {
    public int divisorSubstrings(int num, int k) {
        String str =String.valueOf(num);
        int n =str.length();
        int j=k;
        int c=0;
        for(int i=0;i<=n-k;i++){
            int val=Integer.parseInt(str.substring(i,j));
            if(val!=0 && num%val==0 ){
                c++;
            }
            j++;
        }
        return c;
        

        }
    }
