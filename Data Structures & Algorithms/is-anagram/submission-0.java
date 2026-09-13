class Solution {
    public boolean isAnagram(String s, String t) {

    Hashtable<Character, Integer> tableS = new Hashtable<>();
    Hashtable<Character, Integer> tableT = new Hashtable<>();

    for(char c: s.toCharArray()){
        tableS.put(c,tableS.getOrDefault(c,0)+1);
    }
    for(char c: t.toCharArray()){
        tableT.put(c,tableT.getOrDefault(c,0)+1);
    }

   return  tableS.equals(tableT);
    
    }
}
