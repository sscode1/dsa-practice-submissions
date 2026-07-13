class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s:strs) {
            String encoding = getEncoding(s);
            if (!hm.containsKey(encoding)) {
                hm.put(encoding, new ArrayList<>());
            }
            hm.get(encoding).add(s);
        }
        for(Map.Entry<String, List<String>> en:hm.entrySet()) {
            ans.add(en.getValue());
        }

        return ans;
    }
    private String getEncoding(String s) {
        int[] carr = new int[26];
        for(char c:s.toCharArray()) {
            carr[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            while (carr[i] > 0) {
                sb.append((char)('a' + i));
                carr[i]--;
            }
        }

        return sb.toString();
    }
}
