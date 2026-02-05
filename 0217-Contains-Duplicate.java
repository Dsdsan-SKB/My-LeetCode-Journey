class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> countNums = new HashSet<>();
        for (int num : nums){
            if (countNums.contains(num)) return true;
            else countNums.add(num);
        }
        return false;
    }
}
