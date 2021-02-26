package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zzh
 * @description
 * @date
 */
public class DateUtil {

    /*
     *功能描述 将下单时间类型转换
     */
    public static String getDateString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(date);
    }
    public static String getOrderNo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

}
