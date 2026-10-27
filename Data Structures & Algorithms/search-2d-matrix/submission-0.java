class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++){
            if(bSearchArray(matrix[i], target)){
                return true;
            }
        }
        return false;
    }

    private boolean bSearchArray(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int mid = l + ((r - l) / 2);

            if (array[mid] < target) {
                l = mid + 1;
            } else if (array[mid] > target) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
