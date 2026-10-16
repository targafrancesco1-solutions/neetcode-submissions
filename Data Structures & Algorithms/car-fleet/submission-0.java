class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> cars = new ArrayList<>();
        Deque<Double> stack = new ArrayDeque<>();
        for (int i = 0; i < position.length; i++) {
            cars.add(new int[] {position[i], speed[i]});
        }
        cars.sort((a, b) -> b[0] - a[0]);

        for (int[] element : cars) {
            double time = (double) (target - element[0]) / element[1];
            if (!stack.isEmpty()) {
                if (time > stack.peek()) {
                    stack.push(time);
                }
            }else{
                stack.push(time);
            }
        }
        return stack.size();
    }
}
