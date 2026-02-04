class Solution {
    public int findClosestNumber(int[] nums) {
        int result = nums [0];
        for (int i = 1; i < nums.length; i++){
            int temp = nums [i];
            result = (Math.abs(temp) <= Math.abs(result)) && (result != Math.abs(temp))? temp:result;
        }
        return result;
    }
}
