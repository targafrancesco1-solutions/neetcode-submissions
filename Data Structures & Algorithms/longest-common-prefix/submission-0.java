public class TrieNode{

Map<Character, TrieNode> child  = new HashMap<>();

}

public class Trie {
    TrieNode root = new TrieNode();

    public void insert(String word){
        TrieNode node = root;
        for (char c : word.toCharArray()){
            node.child.putIfAbsent(c, new TrieNode());
            node = node.child.get(c);
        }
    }

    public int lcp(String word,int max){
        TrieNode node = root;
        int i = 0;

        while(i < Math.min(max, word.length())){
            char c = word.charAt(i);
            if(!node.child.containsKey(c)){
                return i;
            }

        i++;
        node = node.child.get(c);
    }
    return i;
}
}

class Solution {
    

    public String longestCommonPrefix(String[] strs) {
        Trie tree = new Trie();
        String min = strs[0];
        for (String s : strs){
            if(s.isEmpty()){
                return "";
            }
            
            if(s.length() < min.length()){
                min = s;
            }
        
        }

        tree.insert(min);
        int delim = min.length();
        for(int i = 0; i<strs.length;i++){
           delim = tree.lcp(strs[i],min.length()) < delim ? tree.lcp(strs[i],min.length()) : delim; 
        }

        return strs[0].substring(0,delim);
    }
}