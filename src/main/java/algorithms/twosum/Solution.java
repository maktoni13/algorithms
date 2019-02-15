package algorithms.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer fromMap = map.get(target - nums[i]);
            if (fromMap == null){
                map.putIfAbsent(nums[i], i);
            } else {
                return new int[]{fromMap, i};
            }
        }
        return new int[]{};
    }
}
