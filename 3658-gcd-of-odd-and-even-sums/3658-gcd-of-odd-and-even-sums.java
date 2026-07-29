class Solution {
    public int gcdOfOddEvenSums(int n) {
        
    int sumOdd=(n*(n+1))/2;
    int sumEven=(n*(3+n))/2;
    if(n==1)
    return 1;
    else
    return gcd(sumOdd,sumEven);
    }
    public int gcd(int sumOdd, int sumEven){
        int a=sumOdd;
        int b=sumEven;
        while(b!=0){
            int temp=b;
            b=b%a;
            a=temp;
        }
        return a;
    }

}