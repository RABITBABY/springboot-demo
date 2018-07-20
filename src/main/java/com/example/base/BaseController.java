package com.example.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 *
 * @description : 控制器基类
 * ---------------------------------
 * @Author : Liang.Guangqing
 * @since : Create in 2017/9/20 10:25
 */
public abstract class BaseController {
    private static Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 计算当前页数
     *
     * @param start
     *            偏移量
     * @param length
     *            页大小
     * @return pageNo 当前页数
     */
    public static Integer getPageNo(Integer start, Integer length) {
        Integer pageNo = 1;
        if (++start > 1) {
            pageNo = start / length;
            if (start % length > 0)
                pageNo++;
        }
        return pageNo;
    }

    /**
     * @Description : date的那月第一天
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/20 10:12
     */
    public static Date getMonthFirstDay(Date date) {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        //设置当前时刻的分钟为0
        calendar.set(Calendar.MINUTE, 0);
        //设置当前时刻的秒钟为0
        calendar.set(Calendar.SECOND, 0);
        //设置当前的毫秒钟为0
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * @Description : date的那月最后一天
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/20 10:13
     */
    public static Date getMonthLastDay(Date date) {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        //设置当前时刻的分钟为0
        calendar.set(Calendar.MINUTE, 59);
        //设置当前时刻的秒钟为0
        calendar.set(Calendar.SECOND, 59);
        //设置当前的毫秒钟为0
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /**
     * 获取当年的第一天
     * @return
     */
    public static Date getCurrYearFirst(){
        Calendar currCal=Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return getYearFirst(currentYear);
    }

    /**
     * 获取当年的最后一天
     * @return
     */
    public static Date getCurrYearLast(){
        Calendar currCal=Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return getYearLast(currentYear);
    }

    /**
     * 获取某年第一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearFirst(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        Date currYearFirst = calendar.getTime();
        return currYearFirst;
    }

    /**
     * 获取某年最后一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearLast(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();

        return currYearLast;
    }
}
