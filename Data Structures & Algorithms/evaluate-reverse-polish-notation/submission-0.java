class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operands = new HashSet<>();
        operands.add("+");
        operands.add("*");
        operands.add("/");
        operands.add("-");
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for (String s : tokens) {
            if (!operands.contains(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int second = stack.pop();
                int first = stack.pop();
                switch (s) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*": 
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
