package com.kk.base.web.controller;

import java.util.Map;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kk.base.util.XDateUtils;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/web",method = RequestMethod.GET)
public class WebController {

	@ApiOperation(value="测试hi接口", notes="测试hi接口")
	@RequestMapping("/hi")
	public String hi(Map<String, Object> model) {
		model.put("time", XDateUtils.nowToString());
		model.put("message", "这是测试的内容。。。");
		model.put("toUserName", "张三");
		model.put("fromUserName", "老许");
		return "welcome"; //自动寻找resources/templates中名字为welcome.ftl/welcome.vm的文件作为模板，拼装后返回
	}
}
