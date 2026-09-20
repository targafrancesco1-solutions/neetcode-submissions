class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = i + 1;

        while (i < j) {
            int secondIndex = target - numbers[i];
            if (secondIndex > numbers[numbers.length - 1]) {
                i++;
                j++;
                continue;
            }
            while (j < numbers.length) {
                if (numbers[j] == secondIndex) {
                    return new int[] {i+1, j+1};
                }
                j++;
            }
            
            i++;
            j = i+1;
        }
        return new int[] {};
    }
}
