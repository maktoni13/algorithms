package algorithms.findtheduplicatenumber;

class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (arr[num - 1] == num) {
                return num;
            }
            arr[num - 1] = num;
        }
        return 1;
    }
}