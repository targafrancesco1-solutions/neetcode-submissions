class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int l = 0;
        Map<Character,Integer> freq = new HashMap<>();
        int most = 0;
        for(int r = 0; r < s.length(); r++){
            int currentFreq = freq.getOrDefault(s.charAt(r), 0) + 1;
            freq.put(s.charAt(r), currentFreq);
            most = Math.max(most,currentFreq);
            while((r-l+1) - most > k){
                freq.put(s.charAt(l), freq.get(s.charAt(l))-1);
                l++;
            }
            
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
