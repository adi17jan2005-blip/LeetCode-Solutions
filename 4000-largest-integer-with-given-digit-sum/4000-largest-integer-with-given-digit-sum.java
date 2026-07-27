class Solution {
    int largest=-1;
    public int largestInteger(int n, int s) {
        for(int i=0;i<Math.pow(10,n);i++){
            if(add(i)==s){
                largest=i;
            }
        }
        return largest;
    }
    public int add(int i)
    {
        int sum=0;
        while(i!=0)
        {
            int temp=i%10;
            sum=sum+temp;
            i=i/10;
        }
        return sum;
    }
}