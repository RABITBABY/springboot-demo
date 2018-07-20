package com.example.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.example.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import io.swagger.annotations.ApiModelProperty;

/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : Msg 实体类
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-07-20
 */
@TableName("msg")
public class Msg extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String msg;
	@TableField("come_from")
	private String comeFrom;
	@TableField("create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getComeFrom() {
		return comeFrom;
	}

	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	@Override
	public String toString() {
		return "Msg{" +
			", id=" + id +
			", msg=" + msg +
			", comeFrom=" + comeFrom +
			", createTime=" + createTime +
			"}";
	}
}
