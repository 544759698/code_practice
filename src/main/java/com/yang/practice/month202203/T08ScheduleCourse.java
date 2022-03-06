package com.yang.practice.month202203;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * leetcode 210
 *
 * @Author: yangguojun01
 * @Date: 2022/3/6
 */
public class T08ScheduleCourse {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ret = new int[numCourses];
        List<List<Integer>> edges = new ArrayList<>();
        int[] degrees = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
            degrees[prerequisites[i][0]]++;
        }
        Queue<Integer> available = new PriorityQueue<>();
        for (int i = 0; i < degrees.length; i++) {
            if (degrees[i] == 0) {
                available.offer(i);
            }
        }
        int idx = 0;
        while (!available.isEmpty()) {
            int course = available.poll();
            ret[idx] = course;
            idx++;
            for (int i = 0; i < edges.get(course).size(); i++) {
                degrees[edges.get(course).get(i)]--;
                if (degrees[edges.get(course).get(i)] == 0) {
                    available.offer(edges.get(course).get(i));
                }
            }
        }
        if (idx == numCourses) {
            return ret;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        T08ScheduleCourse t = new T08ScheduleCourse();
        int[][] prerequisites = new int[1][2];
        prerequisites[0][0] = 1;
        prerequisites[0][1] = 0;
        System.out.println(t.findOrder(2, prerequisites));
    }

}
