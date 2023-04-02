package ac.jiu.java.leetcode;
import java.util.*;

public class Q53_MaximumSubArray {
    //Given an integer array nums, find the subarray, with the largest sum, and return its sum.
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        //sum(array1);
        System.out.println(sum(array1));

    }

    public static int sum(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];


        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            if (nums[nums.length - 1] > max) {
                max = nums[nums.length - 1];
            }
            //sum += nums[i];
//            if (nums[i + 1] >= sum) {
//                max = nums[i + 1];
//            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
                //System.out.println(max);
            }

        }

        return max;
    }
}
