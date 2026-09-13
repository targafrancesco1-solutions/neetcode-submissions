class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
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

        return new ArrayList<>(map.values());

    }
}
