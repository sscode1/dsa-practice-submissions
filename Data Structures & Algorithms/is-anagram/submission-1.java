class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphArr = new int[26];
        for(char c:s.toCharArray()) {
            alphArr[c - 'a']++;
        }
        for(char c:t.toCharArray()) {
            alphArr[c - 'a']--;
            if (alphArr[c - 'a'] < 0) return false;
        }
        for(int x:alphArr) {
            if (x > 0) {
                return false;
            }
        }

        return true;
    }
}
