package com.binary.leetcodeTop;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 题目链接
 * https://leetcode.cn/problem-list/2ckc81c/?page=1
 */
public class Num001 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                return new int[] {hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
