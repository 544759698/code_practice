package com.yang.practice.guava;

import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/6
 */
public class CollectionTest {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("aa", "bb", "cc");
        System.out.println(Joiner.on(",").join(list));
        Map<String, Integer> map = Maps.newHashMap();
        map.put("xiaoming", 12);
        map.put("xiaohong", 13);
        String result = Joiner.on(",").withKeyValueSeparator("=").join(map);
        System.out.println(result);
        String str = "1-2-3";
        List<String> strlist = Splitter.on('-').splitToList(str);
        System.out.println(strlist);
    }

}
