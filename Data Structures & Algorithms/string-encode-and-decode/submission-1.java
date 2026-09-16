class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        char limit = 'a' +250 ;
        for(String s : strs){
            sb.append(s);
            sb.append(limit);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        char limit = 'a' +250 ;
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] input = str.toCharArray();
        String s = "";
         for(char c : input) {

            if(c == limit){
                result.add(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(c);
            }

         }

         return result;

    }
}
