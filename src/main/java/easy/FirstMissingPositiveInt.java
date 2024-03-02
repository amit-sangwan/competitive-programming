package easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstMissingPositiveInt {

/**
 * A solution class to find the First Missing Positive greater than 0 that does not occur in the given array.
 **/


@Test
public void missinIntegerTest() {
    // Test case 1: Missing integer is 4
    int[] arr1 = {1, 2, 3, 5};
    Assert.assertEquals(4, missingInteger(arr1));

    // Test case 2: Missing integer is 1
    int[] arr2 = {0, -1, -2};

    Assert.assertEquals(1, missingInteger(arr2));

    // Test case 3: Missing integer is 6
    int[] arr3 = {1, 2, 3, 4, 5};

    Assert.assertEquals(6, missingInteger(arr3));

    // Test case 4: All positive integers present, expected result is 7
    int[] arr4 = {1, 2, 3, 4, 5, 6};

    Assert.assertEquals(7, missingInteger(arr4));

    // Test case 5: Only negative integers, expected result is 1
    int[] arr5 = {-1, -2, -3, -4, -5};

    Assert.assertEquals(1, missingInteger(arr5));
}

    public int missingInteger(int[] A) {



        //amittsangwan: Type You Code Here


        return 1;
    }

}