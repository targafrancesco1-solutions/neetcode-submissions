class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = numbers.length-1;

        while(i < j){
            
            int secondIndex = target - numbers[i];
            if(secondIndex > numbers[numbers.length-1]){
                i++;
                continue;
            }
            while( j > i){
                if(numbers[j] == secondIndex){
                    return new int[] {i+1,j+1};
                }else{
                    j--;
                }
            }
            i++;
            j = numbers.length-1;
        }
        return new int[]{};
    }
}
