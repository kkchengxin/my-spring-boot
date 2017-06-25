package com.kk.base.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kk.base.web.result.JsonResult;
import com.kk.base.web.result.ResultCode;


/**
 * 管理接口：登录……等
 * @author XuJijun
 *
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	//@Value("${spring.profiles}")
	//private String env;

	private String userName = "admin";
	private String pw = "123456";

	/**
	 * 登录
	 * @param request
	 * @param response 用于保存token到cookie中
	 * @param userName
	 * @param password
	 * @return
	 */
	@ApiOperation(value="登录", notes="用户登录")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType="query",name = "userName", value = "用户名", required = true, dataType = "String"),
			@ApiImplicitParam(paramType="query",name = "password", value = "密码", required = true, dataType = "String")
	})
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public JsonResult login(HttpServletRequest request, HttpServletResponse response, @RequestParam String userName,@RequestParam String password) {
		if(userName.equals(userName) && pw.equals(password)){
			return new JsonResult(ResultCode.SUCCESS, "登录成功！", null);
		}else {
			return new JsonResult(ResultCode.NOT_LOGIN, "登录失败！", null);
		}
	}
}
