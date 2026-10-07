class MinStack {
    Stack<int[]> stack;
    int min;
    public MinStack() {
        this.stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        min = val < min ? val : min;
        stack.push(new int[] {val, min});
    }

    public void pop() {
        stack.pop();
        if (!stack.isEmpty()) {
            min = stack.peek()[1];
        } else {
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return min;
    }
}
