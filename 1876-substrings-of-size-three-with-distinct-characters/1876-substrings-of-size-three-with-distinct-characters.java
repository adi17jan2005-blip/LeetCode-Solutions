import java.util.HashSet;

class Solution {

    public int countGoodSubstrings(String s) {

        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {

            String sub = s.substring(i, i + 3);

            if (dupe(sub)) {
                count++;
            }
        }

        return count;
    }

    public boolean dupe(String a) {

        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {

            if (!h.add(a.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}