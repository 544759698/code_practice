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
public class WeekLocalDateTime implements ILocalDateTime {
    @Override
    public LocalDateTime parseLocalDateTime(String timestamp) {
        String[] ts = timestamp.split("-");
        int year = Integer.parseInt(ts[0]);
        int week = Integer.parseInt(ts[1]);
        LocalDateTime dateTime = getFirstDayOfWeek(year, week);
        return dateTime;
    }

    private LocalDateTime getFirstDayOfWeek(int year, int week) {
        LocalDateTime internalDay = LocalDateTime.of(year, 1, 30, 0, 0);
        int internalWeek = getWeekNumber(internalDay);
        LocalDateTime nextMonday = internalDay.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        LocalDateTime dateTime = nextMonday.plusWeeks(week - internalWeek - 1);
        return dateTime;
    }

    private int getWeekNumber(LocalDateTime dateTime) {
        TemporalField woField = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int weekNum = dateTime.toLocalDate().get(woField);
        return weekNum;
    }
}
