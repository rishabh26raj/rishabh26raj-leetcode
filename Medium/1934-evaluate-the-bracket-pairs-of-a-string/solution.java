// Problem: 1934. Evaluate the Bracket Pairs of a String
// Difficulty: Medium
// Language: Java
// Link: https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(j) != ')') {
                    j++;
                }
                String key = s.substring(i + 1, j);
                ans.append(map.getOrDefault(key, "?"));
                i = j;
            } 
            else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
