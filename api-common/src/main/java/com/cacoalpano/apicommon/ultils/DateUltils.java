package com.cacoalpano.apicommon.ultils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUltils {
    public static final String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public static final String yyyyMMdd = "yyyy-MM-dd";
    public static final String yyyyMMddHHmm = "yyyy-MM-dd HH:mm";

    public static String getNowFullTime() {
        SimpleDateFormat formatter = new SimpleDateFormat(yyyyMMddHHmmss);
        return formatter.format(Calendar.getInstance().getTime());
    }

    public static Date convertStringtoDate(String format, String date) {
        if (date == null || format == null) return null;
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getNowTime(String format) {
        if (format == null) return null;
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(Calendar.getInstance().getTime());
    }

}
