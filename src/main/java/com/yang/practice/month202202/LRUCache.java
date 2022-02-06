package com.yang.practice.month202202;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/6
 */
public class LRUCache {

    int capacity;
    HashMap<Integer, Integer> map;
    Queue<Integer> queue;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        queue = new LinkedList<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            queue.remove(key);
            queue.add(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (queue.contains(key)) {
            queue.remove(key);
            map.remove(key);
        } else if (queue.size() >= capacity) {
            int top = queue.poll();
            map.remove(top);
        }
        queue.add(key);
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache l = new LRUCache(2);
        l.put(1, 1);
        l.put(2, 2);
        l.get(1);
        l.put(3, 3);
        l.get(2);
        l.put(4, 4);
        System.out.println(l.get(1));
    }

}
