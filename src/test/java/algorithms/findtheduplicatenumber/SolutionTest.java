package algorithms.findtheduplicatenumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/* 287

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
find the duplicate one.

Note:
1. You must not modify the array (assume the array is read only).
2. You must use only constant, O(1) extra space.
3. Your runtime complexity should be less than O(n2).
4. There is only one duplicate number in the array, but it could be repeated more than once.

 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void findDuplicate1() {
        int[] arr = new int[]{1,3,4,2,2};
        int expected = 2;
        assertEquals(expected, solution.findDuplicate(arr));
    }

    @Test
    public void findDuplicate2() {
        int[] arr = new int[]{3,1,3,4,2};
        int expected = 3;
        assertEquals(expected, solution.findDuplicate(arr));
    }

}