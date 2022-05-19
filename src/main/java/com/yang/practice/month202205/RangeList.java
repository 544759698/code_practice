package com.yang.practice.month202205;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/19
 */
public class RangeList {
    List<RangeItem> merged = new ArrayList<>();

    public void add(int[] range) {
        if (range == null || range.length != 2 && range[0] >= range[1]) {
            return;
        }
        merged.add(new RangeItem(range));
        merged.sort(new Comparator<RangeItem>() {
            @Override
            public int compare(RangeItem o1, RangeItem o2) {
                return o1.getStart() - o2.getStart();
            }
        });
        List<RangeItem> newMerged = new ArrayList<>();
        for (int i = 0; i < merged.size(); i++) {
            int left = merged.get(i).getStart();
            int right = merged.get(i).getEnd();
            if (newMerged.size() == 0 || newMerged.get(newMerged.size() - 1).getEnd() < left) {
                newMerged.add(new RangeItem(left, right));
            } else {
                newMerged.get(newMerged.size() - 1)
                        .setEnd(Math.max(newMerged.get(newMerged.size() - 1).getEnd(), right));
            }
        }
        merged = newMerged;
    }

    public void remove(int[] range) {
        if (range == null || range.length != 2 && range[0] >= range[1]) {
            return;
        }
        List<RangeItem> newMerged = new ArrayList<>();
        for (int i = 0; i < merged.size(); i++) {
            if (merged.get(i).getEnd() <= range[0] || merged.get(i).getStart() >= range[1]) {
                newMerged.add(merged.get(i));
            } else if (range[0] == merged.get(i).getStart() && range[1] == merged.get(i).getEnd()) {
                continue;
            } else if (range[0] >= merged.get(i).getStart() && range[1] <= merged.get(i).getEnd()) {
                if (merged.get(i).getStart() < range[0]) {
                    newMerged.add(new RangeItem(merged.get(i).getStart(), range[0]));
                }
                if (range[1] < merged.get(i).getEnd()) {
                    newMerged.add(new RangeItem(range[1], merged.get(i).getEnd()));
                }
            } else if (range[0] >= merged.get(i).getStart() && range[0] < merged.get(i).getEnd() && range[1] > merged
                    .get(i).getEnd()) {
                newMerged.add(new RangeItem(merged.get(i).getStart(), range[0]));
            } else if (range[0] < merged.get(i).getStart() && range[1] > merged.get(i).getStart() && range[1] < merged
                    .get(i).getEnd()) {
                newMerged.add(new RangeItem(range[1], merged.get(i).getEnd()));
            }
        }
        merged = newMerged;
    }

    public void print() {
        List<String> displays = merged.stream().map(m -> m.toString()).collect(Collectors.toList());
        System.out.println(String.join(" ", displays));
    }

}

class RangeItem {
    private int start;
    private int end;

    public RangeItem() {
    }

    public RangeItem(int[] range) {
        this.start = range[0];
        this.end = range[1];
    }

    public RangeItem(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + this.start + "," + this.getEnd() + ")";
    }

    public static void main(String[] args) {
        RangeList rl = new RangeList();
        rl.add(new int[] {1, 5});
        rl.add(new int[] {10, 20});
        rl.add(new int[] {20, 20});
        rl.add(new int[] {20, 21});
        rl.add(new int[] {3, 8});
        rl.remove(new int[] {10, 10});
        rl.remove(new int[] {10, 11});
        rl.remove(new int[] {15, 17});
        rl.remove(new int[] {3, 19});
        rl.print();
    }

}
