package com.example.util;

import java.io.Serializable;

/**
 *code is far away from bug with the animal protecting
 *  ┏┓　　　┏┓
 *┏┛┻━━━┛┻┓
 *┃　　　　　　　┃ 　
 *┃　　　━　　　┃
 *┃　┳┛　┗┳　┃
 *┃　　　　　　　┃
 *┃　　　┻　　　┃
 *┃　　　　　　　┃
 *┗━┓　　　┏━┛
 *　　┃　　　┃神兽保佑
 *　　┃　　　┃代码无BUG！
 *　　┃　　　┗━━━┓
 *　　┃　　　　　　　┣┓
 *　　┃　　　　　　　┏┛
 *　　┗┓┓┏━┳┓┏┛
 *　　　┃┫┫　┃┫┫
 *　　　┗┻┛　┗┻┛
 *　　
 *   @description : Result : 响应的结果对象
 *   ---------------------------------
 *   @author : Liang.Guangqing
 *   @since : Create in 2017/9/19 21:08　
 */
public class Result implements Serializable {
	private static final long serialVersionUID = 6288374846131788743L;

	/**
	 * 信息
	 */
	private String msg;

	/**
	 * 是否成功 0成功  其他不成功
	 */
	private Integer status;



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public Result() {

	}
}
