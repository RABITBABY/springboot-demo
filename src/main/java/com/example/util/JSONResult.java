package com.example.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
 *   @description : JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 *   ---------------------------------
 *   @author : Liang.Guangqing
 *   @since : Create in 2017/9/19 21:07　
 */
@JsonInclude(value = Include.NON_NULL)
public class JSONResult<T> extends Result {

	private static final long serialVersionUID = 7880907731807860636L;

	/**
	 * 数据
	 */
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public JSONResult() {
		super();
	}

	/**
	 * 自定义返回的结果
	 *
	 * @param data
	 * @param message
	 * @param success
	 */
	public JSONResult(T data, String msg, Integer status) {
		this.data = data;
		super.setMsg(msg);
		super.setStatus(status);
	}

	/**
	 * 成功返回数据和消息
	 *
	 * @param data
	 * @param message
	 */
	public JSONResult(T data, String msg) {
		this.data = data;
		super.setMsg(msg);
		super.setStatus(0);
	}

	/**
	 * 成功返回数据
	 *
	 * @param data
	 */
	public JSONResult(T data) {
		this.data = data;
		super.setStatus(0);
	}

	/*@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}*/
}