
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            long res = 1;
            row.add(1); // First element is always 1
            
            //this calculates the ncr for each element
            for (int k = 1; k <= n; k++) {
                
                res = res * (n - k + 1);
                res = res / k;
                row.add((int) res);
            }
            ans.add(row);
        }
        return ans;
    }
}   