package com.yang.practice.sie;

import java.time.LocalDateTime;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class HourLocalDateTime implements ILocalDateTime {
    @Override
    public LocalDateTime parseLocalDateTime(String timestamp) {
        String[] x = timestamp.split("\\s+");
        String[] ts = x[0].split("-");
        LocalDateTime dateTime = LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]),
                Integer.parseInt(ts[2]),
                Integer.parseInt(x[1]), 0);
        return dateTime;
    }
}
