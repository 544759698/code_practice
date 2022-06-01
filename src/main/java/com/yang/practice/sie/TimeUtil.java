package com.yang.practice.sie;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class TimeUtil {

    public static LocalDateTime parseLocalDateTime(String period, String timestamp) {
        ILocalDateTime processor = LocalDateTimeFactory.getProcessor(period);
        return processor.parseLocalDateTime(timestamp);
    }

    public static void main(String[] args) {
        System.out.println(TimeUtil.parseLocalDateTime("month","2018-11"));
    }

}
