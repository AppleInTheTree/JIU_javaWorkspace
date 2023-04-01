package ac.jiu.java.leetcode;

import java.util.*;
public class Q217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7};

        System.out.println(check(array));

        System.out.println(checkWithArray(array));





    }
    public static boolean checkWithArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean check(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int indexValue = array[i];
            int indexMin = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    //indexValue = array[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                array[i] = array[indexMin];
                array[indexMin] = indexValue;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;


    }

}
