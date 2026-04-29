class Solution {
    public int strStr(String haystack, String needle) {
        int k = needle.length();
        int j = k;

        for (int i = 0; i <= haystack.length() - k; i++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
            j++;
        }

        return -1;
    }
}