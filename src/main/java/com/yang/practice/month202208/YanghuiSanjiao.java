package com.yang.practice.month202208;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/23
 */
public class YanghuiSanjiao {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> preRet = ret;
            ret = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i){
                    ret.add(1);
                }else{
                    ret.add(preRet.get(j-1)+preRet.get(j));
                }
            }
        }
        return ret;
    }
}
