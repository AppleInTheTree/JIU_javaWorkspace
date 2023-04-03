package ac.jiu.java.leetcode;
import java.util.*;

public class Q1_TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        for (int x : twoSum(array, 9)) {
            System.out.println(x);
        }
    }

    // brute force -> O(n ^ 2)
    public static int[] twoSum(int[] nums, int target) {

        int[] targetArray = new int[2];
        int index = 0;


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index = j;
                    System.out.println(i);
                }
            }
            if (index != 0) {
                targetArray[0] = i;
                targetArray[1] = index;

            }
        }
        return targetArray;
    }

    // two - pointer -> O(n) 이러면 원래 어레이를 return 할수 없게 되버린다. 따라서 Hashmap 을 써야 한다
    public static int[] twoPointerSum(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if ((nums[left] + nums[right]) > target) {
                right--;
            }
            else if ((nums[left] + nums[right]) < target) {
                left++;
            }
            else {
                // 이런식으로 선언도 가능하다
                return new int[] {left, right};
            }
        }
        return new int[] {left, right};

    }
}
