class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       // first solution without watching the explanation , O(m n log n ) cause we sort every string
       
       /* Map<String,List<String>> map = new HashMap<>();
        
        for(int i = 0; i< strs.length; i++){
            char[] aux = strs[i].toCharArray();
            Arrays.sort(aux);
            String s = new String(aux);
            if(map.containsKey(s)) {
                List<String> newList = new ArrayList<>(map.get(s));
                newList.add(strs[i]);
                map.put(s, newList);
            } else {
                map.put(s, List.of(strs[i]));
            }
        }

        return new ArrayList<>(map.values()); */

        //after watching the explanation the intuition is : think about usink the frequency of the letters
        // in a string as the hashmapkey with the same value that you thought about in your solution

        
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs ){
            int[] count = new int[26];

            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

            }

            return new ArrayList<>(map.values());
        }

    
}
