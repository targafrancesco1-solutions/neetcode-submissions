class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int l = 0;
        int r = 0;
        Map<Character, Integer> window = new HashMap<>();
        int matched = 0;
        int[] result = {0, Integer.MAX_VALUE};
        while (r < s.length()) {
            // 1. ADD r
            char c = s.charAt(r);

            if (freq.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);

                if (window.get(c).equals(freq.get(c))) {
                    matched++;
                }
            }

            // 2. SHRINK while valid
            while (matched == freq.size()) {
                // save answer
                if (r - l < result[1] - result[0]) {
                    result[0] = l;
                    result[1] = r;
                }
                char leftChar = s.charAt(l);

                if (freq.containsKey(leftChar)) {
                    window.put(leftChar, window.get(leftChar) - 1);

                    if (window.get(leftChar) < freq.get(leftChar)) {
                        matched--;
                    }
                }

                l++;
            }

            // 3. move r
            r++;
        }
        return result[1] > s.length() ? "" : s.substring(result[0], result[1] + 1);
    }
}
