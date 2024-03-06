class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)   {
        int lenNum2 = n;    // 4
        int lenNum1 = m-n ; //3
        int num1Total = m ; //7

        System.out.println(Arrays.toString(nums1));

        System.out.println(Arrays.toString(nums2));

        for(int i = lenNum1 ;i < num1Total-1 ; i ++){
            for(int j = 0 ; j < n ; j++){
                nums1[i] = nums2[j];
            }
        }

        System.out.println(Arrays.toString(nums1));

        System.out.println(Arrays.toString(nums2));
    }


} 