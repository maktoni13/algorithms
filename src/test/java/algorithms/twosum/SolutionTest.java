package algorithms.twosum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/* 1
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void twoSum() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int expectedLength = 2;
        int[] result = solution.twoSum(arr, target);
        assertEquals(expected.length, result.length);
        assertEquals(expectedLength, result.length);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}
