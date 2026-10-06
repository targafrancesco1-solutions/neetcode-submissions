class Solution {
    public boolean isValid(String s) {
       /* Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty()){
                if(s.charAt(i) == ')' && stack.peek() != '('){
                    return false;
                }
                if(s.charAt(i) == ']' && stack.peek() != '['){
                    return false;
                }
                if(s.charAt(i) == '}' && stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
        */
        //good looking solution
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
