package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class MinNumOfMovesToMakeArrDistinct {

    @Test
    public void testMinOperations() {
        int[] a1 = {1, 2, 1};
        int[] a2 = {2, 1, 4, 4};
        int[] a3 = {6, 2, 3, 5, 6, 3};

        // Test case 1
        Assert.assertEquals(minOperations(a1), 2);

        // Test case 2
        Assert.assertEquals(minOperations(a2), 1);

        // Test case 3
        Assert.assertEquals(minOperations(a3), 2);
    }

    public static int minOperations(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();
        int operations = 0;

        for (int num : nums) {
            while (seenNumbers.contains(num)) {
                num++;
                operations++;
            }
            seenNumbers.add(num);
        }

        return operations;
    }
}
