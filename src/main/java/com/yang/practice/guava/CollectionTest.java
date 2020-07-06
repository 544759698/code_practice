package com.yang.practice.guava;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/6
 */
public class CollectionTest {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("aa", "bb", "cc");
        System.out.println(Joiner.on(",").join(list));
    }

}
