package com.yang.practice.algorithm20200719;

/**
 * 偷金子，不能连续偷，求最大值 {3,5,2,10}
 *
 * @Author: yangguojun01
 * @Date: 2020/7/19
 */
public class GoldSolution {

    public int getMaxGold(int[] golds) {
        if (golds == null || golds.length == 0) {
            return 0;
        }
        int[] memos = new int[golds.length];
        return getMemo(0, memos, golds);
    }

    private int getMemo(int id, int[] memos, int[] golds) {
        if (id > golds.length - 1) {
            return 0;
        }
        if (memos[id] > 0) {
            return memos[id];
        }
        int currentSelected = golds[id] + getMemo(id + 2, memos, golds);
        int currentUnselected = getMemo(id + 1, memos, golds);
        return memos[id] = Math.max(currentSelected, currentUnselected);
    }

    public static void main(String[] args) {
        GoldSolution solution = new GoldSolution();
        int[] golds = new int[] {3, 5, 2, 10};
        System.out.println(solution.getMaxGold(golds));
    }

}
