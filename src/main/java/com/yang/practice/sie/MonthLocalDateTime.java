package com.yang.practice.sie;

import java.time.LocalDateTime;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class MonthLocalDateTime implements ILocalDateTime {
    @Override
    public LocalDateTime parseLocalDateTime(String timestamp) {
        String[] ts = timestamp.split("-");
        LocalDateTime dateTime = LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]), 1, 0, 0);
        return dateTime;
    }
}
