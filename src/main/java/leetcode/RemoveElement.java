package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums
in-place. The order of the elements may be changed. Then return the number of elements
in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted
,you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements
which are not equal to val. The remaining elements of nums are not important as
well as the size of nums.
Return k.

 */
    @Test
    public void driver(){
        int[] arr= {3,2,2,3};
        int[] arr2 ={0,1,2,2,3,0,4,2};
 
        int k =3 ;
        int k2 = 2;

        Assert.assertEquals(removeElement(arr, k ),2);
        Assert.assertEquals(removeElement(arr2, k2 ),4);

    }
    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        int start = 0, end = size - 1;
        while (start <= end) {
            if (nums[start] == val && nums[end] != val) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }

            if (nums[start] != val) {
                start++;
            }
            if (nums[end] == val) {
                end--;
            }
        }
        return start;
    }

}
