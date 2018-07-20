package com.example.demo.serviceTest;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.base.BaseApplicationTests;
import com.example.entity.Msg;
import com.example.service.MsgService;
import com.example.util.MapUtil;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author 
 * @date 2017/12/18
 */
public class CommoneTest extends BaseApplicationTests{
	
	@Autowired
	private MsgService msgService;
	
	@Test
	public void testName() {
		Map<String,Object> map=new HashMap<>();
		map.put("id", 1);
		map.put("msg", "hello");
		
		Msg msg=new Msg();
		
		Msg changeBean=null;
		try {
			changeBean = MapUtil.mapToObject(map,Msg.class);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(changeBean.getMsg());
		
		
		Msg  jj=new Msg();
		jj.setId(1);
		jj.setMsg("dfsadas");
		
		Map<?, ?> objectToMap = MapUtil.objectToMap(jj);
		System.out.println(objectToMap.get("msg"));
	}
}