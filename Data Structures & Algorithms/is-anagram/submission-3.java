class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphArr = new int[26];
        if (s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            alphArr[s.charAt(i) - 'a']++;
            alphArr[t.charAt(i) - 'a']--;
        }
        for(int x:alphArr) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}
