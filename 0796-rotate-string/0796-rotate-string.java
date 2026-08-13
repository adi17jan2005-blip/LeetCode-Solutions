class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for (int d = 0; d < s.length(); d++) {

            String rotated = Reverse(s, 0, d - 1);
            rotated = Reverse(rotated, d, s.length() - 1);
            rotated = Reverse(rotated, 0, s.length() - 1);

            if (rotated.equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public String Reverse(String s, int i, int j) {
        char[] arr = s.toCharArray();

        int left = i;
        int right = j;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}