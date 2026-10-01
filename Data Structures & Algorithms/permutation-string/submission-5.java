class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;
        Map<Character, Integer> window = new HashMap<>();
        while (r < s2.length()) {
            if (freq.containsKey(s2.charAt(r))) {
                window.put(s2.charAt(r), window.getOrDefault(s2.charAt(r), 0) + 1);
                while (r - l + 1 > s1.length()) {
                    if (freq.containsKey(s2.charAt(l))) {
                        window.put(s2.charAt(l), window.get(s2.charAt(l))-1);
                    }
                    l++;
                }
                if (window.equals(freq)) {
                    return true;
                }
                r++;
            } else {
                r++;
            }
        }
        return false;
    }
}
