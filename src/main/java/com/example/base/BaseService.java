package com.example.base;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
 * @Description : service接口 基类
 * ---------------------------------
 * @Author : Liang.Guangqing
 * @Date : Create in 2017/11/2 15:27
 */
public interface BaseService<T> extends IService<T> {

    /**
     * @Description : 分页获取列表数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 15:35
     */
    Page<T> selectPageWithParam(Page<T> page, T param);

    /**
     * @Description : 分页获取列表数据 （Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 15:49
     */
    Page<T> selectPageWithMap(Page<T> page, Map<String, Object> map);

    /**
     * @Description : 获取列表数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 19:41
     */
    List<T> selectListWithParam(T param);

    /**
     * @Description : 获取列表数据 （Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 19:41
     */
    List<T> selectListWithMap(Map<String, Object> map);

    /**
     * @Description : 获取List<Map>数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 20:10
     */
    List<Map<String,Object>> selectListMapWithParam(T param);

    /**
     * @Description : 获取List<Map>数据（Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 20:10
     */
    List<Map<String,Object>> selectListMapWithMap(Map<String, Object> map);

    /**
     * @Description : 获取List<Object>数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 20:11
     */
    List<Object> selectListObjWithParam(T param);

    /**
     * @Description : 获取List<Object>数据（Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 20:11
     */
    List<Object> selectListObjWithMap(Map<String, Object> map);

    /**
     * @Description : 获取Map数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 19:53
     */
    Map<String, Object> selectMapWithParam(T param);

    /**
     * @Description : 获取Map数据（Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 19:53
     */
    Map<String, Object> selectMapWithMap(Map<String, Object> map);

    /**
     * @Description : 获取Object数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 20:02
     */
    Object selectObjWithParam(T param);

    /**
     * @Description : 获取Object数据（Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 20:02
     */
    Object selectObjWithMap(Map<String, Object> map);
    
    /**
     * @Description : 获取指定数据（实体类）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 15:51
     */
    T selectOneWithParam(T param);

    /**
     * @Description : 获取指定数据（Map）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 15:59
     */
    T selectOneWithMap(Map<String, Object> map);

    /**
     * @Description : 获取指定数据（Obj）
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/11/2 16:33
     */
    T selectOneByObj(Serializable var1);
}
