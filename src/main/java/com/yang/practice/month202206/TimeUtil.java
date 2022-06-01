package com.yang.practice.month202206;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;
// Refactor this class into OOP style. More classes can be created if necessary.
public class TimeUtil {
    public static final String PERIOD_YEAR = "year";
    public static final String PERIOD_MONTH = "month";
    public static final String PERIOD_WEEK = "week";
    public static final String PERIOD_DAY = "day";
    public static final String PERIOD_HOUR = "hour";
    public static final String PERIOD_MINUTE = "minute";
    public static final String PERIOD_SECOND = "second";
    public static LocalDateTime parseLocalDateTime(String period, String timestamp) {
        LocalDateTime dateTime = null;
        if (PERIOD_YEAR.equals(period)) {// 2018
            dateTime = LocalDateTime.of(Integer.parseInt(timestamp), 1, 1, 0, 0);
        } else if (PERIOD_MONTH.equals(period)) {// 2018-11, 2018-9
            String[] ts = timestamp.split("-");
            dateTime = LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]), 1, 0, 0);
        } else if (PERIOD_WEEK.equals(period)) {
            String[] ts = timestamp.split("-");
            int year = Integer.parseInt(ts[0]);
            int week = Integer.parseInt(ts[1]);
            dateTime = getFirstDayOfWeek(year, week);
        } else if (PERIOD_DAY.equals(period)) {
            String[] ts = timestamp.split("-");
            dateTime =
                    LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]), Integer.parseInt(ts[2]), 0, 0);
        } else if (PERIOD_HOUR.equals(period)) {
            String[] x = timestamp.split("\\s+");
            String[] ts = x[0].split("-");
            dateTime = LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]), Integer.parseInt(ts[2]),
                    Integer.parseInt(x[1]), 0);
        } else if (PERIOD_MINUTE.equals(period)) {
            String[] x = timestamp.split("\\s+");
            String[] ts = x[0].split("-");
            String[] tsa = x[1].split(":");
            dateTime = LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]), Integer.parseInt(ts[2]),
                    Integer.parseInt(tsa[0]), Integer.parseInt(tsa[1]), 0);
        } else if (PERIOD_SECOND.equals(period)) {
            String[] x = timestamp.split("\\s+");
            String[] ts = x[0].split("-");
            String[] tsa = x[1].split(":");
            dateTime = LocalDateTime.of(Integer.parseInt(ts[0]), Integer.parseInt(ts[1]), Integer.parseInt(ts[2]),
                    Integer.parseInt(tsa[0]), Integer.parseInt(tsa[1]), Integer.parseInt(tsa[2]));
        }
        return dateTime;
    }
    private static LocalDateTime getFirstDayOfWeek(int year, int week) {
        LocalDateTime internalDay = LocalDateTime.of(year, 1, 30, 0, 0);
        int internalWeek = getWeekNumber(internalDay);
        LocalDateTime nextMonday = internalDay.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        LocalDateTime dateTime = nextMonday.plusWeeks(week - internalWeek - 1);
        return dateTime;
    }
    private static int getWeekNumber(LocalDateTime dateTime) {
        TemporalField woField = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int weekNum = dateTime.toLocalDate().get(woField);
        return weekNum;
    }
}