package com.yang.practice.month2025;

import java.util.PriorityQueue;

public class MergeArray {

    public int[] findKArray(int[][] arrays, int k) {
        PriorityQueue<Element> heap = new PriorityQueue<>(arrays.length);
        int[] ret = new int[k];
        for (int i = 0; i < arrays.length; i++) {
            heap.offer(new Element(i, 0, arrays[i][0]));
        }
        for (int i = 0; i < k; i++) {
            Element ele = heap.poll();
            ret[i] = ele.getValue();
            heap.offer(new Element(ele.getArrayIndex(), ele.getEleIndex() + 1,
                    arrays[ele.getArrayIndex()][ele.getEleIndex() + 1]));
        }
        return ret;
    }
}

class Element {
    int arrayIndex;

    public int getEleIndex() {
        return eleIndex;
    }

    public Element(int arrayIndex, int eleIndex, int value) {
        this.arrayIndex = arrayIndex;
        this.eleIndex = eleIndex;
        this.value = value;
    }

    public void setEleIndex(int eleIndex) {
        this.eleIndex = eleIndex;
    }

    int eleIndex;

    public int getArrayIndex() {
        return arrayIndex;
    }

    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    int value;
}
