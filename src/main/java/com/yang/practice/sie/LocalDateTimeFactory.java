package com.yang.practice.sie;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class LocalDateTimeFactory {
    public static final String PERIOD_YEAR = "year";
    public static final String PERIOD_MONTH = "month";
    public static final String PERIOD_WEEK = "week";
    public static final String PERIOD_DAY = "day";
    public static final String PERIOD_HOUR = "hour";
    public static final String PERIOD_MINUTE = "minute";
    public static final String PERIOD_SECOND = "second";
    static HashMap<String, ILocalDateTime> map = new HashMap<>();

    static {
        map.put(PERIOD_YEAR, new YearLocalDateTime());
        map.put(PERIOD_MONTH, new MonthLocalDateTime());
        map.put(PERIOD_WEEK, new WeekLocalDateTime());
        map.put(PERIOD_DAY, new DayLocalDateTime());
        map.put(PERIOD_HOUR, new HourLocalDateTime());
        map.put(PERIOD_MINUTE, new MinuteLocalDateTime());
        map.put(PERIOD_SECOND, new SecondLocalDateTime());
    }

    public static ILocalDateTime getProcessor(String period) {
        return map.get(period);
    }

}
