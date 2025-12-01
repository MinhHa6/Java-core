package core.leetcode.arr;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    static boolean containsDuplicated(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // gặp phần tử lặp
            }
            set.add(num);
        }
        return false; // không có phần tử nào lặp
    }

    public static void main(String[] args) {
        int arr[] ={12,3,4,3,2,5};
        System.out.println("Kiem tra co phan tu trung lap ko:"+containsDuplicated(arr));
    }
}
