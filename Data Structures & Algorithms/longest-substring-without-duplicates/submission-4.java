class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){return 0;}
        int length = 1;
        int maxLength = 1;
        Set<Character> check = new HashSet<Character>();
        char[] letters = s.toCharArray();
        int l = 0;
        check.add(letters[l]);
        for (int r = 1; r < letters.length; r++) {
            if (check.contains(letters[r])) {
                length = 1;
                while (check.contains(letters[r])) {
                    check.remove(letters[l]);
                    l++;
                }
                check.add(letters[r]);
                

            } else {
                check.add(letters[r]);
                length++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}
