class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for(String s : strs){
            sb.append(s.length() + "#");
            sb.append(s);
            
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
       
       List<String> result = new ArrayList<>();
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < str.length(); i++) {

        if(str.charAt(i) != '#') {
            sb.append(str.charAt(i));
        } else {
            int length = Integer.parseInt(sb.toString());
            i++;
            sb.setLength(0);
            while (length > 0 ){
                sb.append(str.charAt(i++));
                length--;
            }
            i--;
            result.add(sb.toString());
            sb.setLength(0);
        }
       }

       return result;
       

    }
}
