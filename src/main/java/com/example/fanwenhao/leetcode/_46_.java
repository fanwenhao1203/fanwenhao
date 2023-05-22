package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _46_ {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, curr, result);
        return result;
    }

    private void dfs(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> result) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i ++) {
            if (used[i] == true) {
                continue;
            }
            curr.add(nums[i]);
            used[i] = true;
            dfs(nums, used, curr, result);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
