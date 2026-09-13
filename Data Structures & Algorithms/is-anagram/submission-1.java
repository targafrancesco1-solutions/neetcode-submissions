class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> firstString = new HashMap<>();
        Map<Character, Integer> secondString = new HashMap<>();


        for(int i = 0; i< s.length(); i++){
            if(firstString.containsKey(s.charAt(i))){
                 int value = firstString.get(s.charAt(i)) + 1;
                 firstString.put(s.charAt(i), value);
            }else{
                firstString.put(s.charAt(i), 1);
            }
        }

         for(int i = 0; i< t.length(); i++){
            if(secondString.containsKey(t.charAt(i))){
                 int value = secondString.get(t.charAt(i)) + 1;
                 secondString.put(t.charAt(i), value);
            }else{
                secondString.put(t.charAt(i), 1);
            }
    }

    return firstString.equals(secondString);
}
}
