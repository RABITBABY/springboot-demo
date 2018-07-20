package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.service.MsgService;
import com.example.util.JSONResult;
import com.example.entity.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : Msg 控制器
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-07-20
 */
@RestController
@Api(value="/msg", description="Msg 控制器")
@RequestMapping("/msg")
public class MsgController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(MsgController.class);

    @Autowired
    public MsgService msgService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-07-20
     */
    @GetMapping("/getMsgList")
    @ApiOperation(value="/getMsgList", notes="获取分页列表")
    public JSONResult<Map<String, Object>> getMsgList(@ApiParam(name="Msg",value="Msg 实体类")Msg param ,
                                @ApiParam(name="length",value="页大小",required=true,defaultValue = "10")Integer length,
                                @ApiParam(name="pageNo",value="页数",required=true,defaultValue = "1")Integer pageNo) throws Exception{
            JSONResult<Map<String, Object>> resJson=new JSONResult<Map<String, Object>>();
            Page<Msg> page=new Page<Msg>(pageNo,length);
            msgService.selectPageWithParam(page, param);
            Map<String,Object> map=new HashMap<>();
            map.put("total", page.getTotal());
            map.put("list", page.getRecords());
            resJson.setData(map);
            resJson.setStatus(0);
            return resJson;
    }

    /**
     * @description : 通过id获取Msg
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-07-20
     */
    @GetMapping("/getMsgById")
    @ApiOperation(value="/getMsgById", notes="通过id获取Msg")
    public JSONResult<Msg> getMsgById(@ApiParam(name="id",value="MsgID",required=true)Long id) throws Exception{
            JSONResult<Msg> resJson = new JSONResult<>();
            Msg param= msgService.selectOneByObj(id);
            resJson.setData(param);
            resJson.setStatus(0);
            return resJson;
    }

    /**
     * @description : 通过id删除Msg
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-07-20
     */
    @DeleteMapping("/deleteMsgById")
    @ApiOperation(value="/deleteMsgById", notes="通过id删除Msg")
    public JSONResult<Msg> deleteMsgById(@ApiParam(name="id",value="MsgID",required=true)Long id) throws Exception{
            JSONResult<Msg> resJson = new JSONResult<>();
            boolean boo=msgService.deleteById(id);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 通过id更新Msg
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-07-20
     */
    @PutMapping("/updateMsgById")
    @ApiOperation(value="/updateMsgById", notes="通过id更新Msg")
    public JSONResult<Msg> updateMsgById(@ApiParam(name="Msg",value="Msg 实体类")Msg param) throws Exception{
            JSONResult<Msg> resJson = new JSONResult<>();
            boolean boo=msgService.updateById(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 添加Msg
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-07-20
     */
	@PutMapping("/addMsg")
    @ApiOperation(value="/addMsg", notes="添加Msg")
    public JSONResult<Msg> addMsg(@ApiParam(name="Msg",value="Msg 实体类")Msg param) throws Exception{
            JSONResult<Msg> resJson = new JSONResult<>();
            boolean boo=msgService.insert(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }
}
