package ac.jiu.java.leetcode;
import java.util.*;

public class Q53_MaximumSubArray {
    //Given an integer array nums, find the subarray, with the largest sum, and return its sum.
    public static void main(String[] args) {
        int[] array1 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        //sum(array1);
        System.out.println(sum(array1));

    }

    // brute-force 방법 / (n^2) linear 알고리즘으로 다시 풀자
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
            if(nums[i] > max) {
                max = nums[i];
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
    public static int kadaneAlgorithm(int[] nums) {
        int maxSoFar = nums[0];
        int maxFromRound = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxFromRound = Math.max(maxFromRound + nums[i], nums[i]);
            maxSoFar = Math.max(maxFromRound, maxSoFar);
        }

        return maxSoFar;
    }


}
