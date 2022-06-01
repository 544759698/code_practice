package com.yang.practice.sie;

import java.time.LocalDateTime;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class YearLocalDateTime implements ILocalDateTime {
    @Override
    public LocalDateTime parseLocalDateTime(String timestamp) {
        LocalDateTime dateTime = LocalDateTime.of(Integer.parseInt(timestamp), 1, 1, 0, 0);
        return dateTime;
    }
}
