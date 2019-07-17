package com.zl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/userServlet.do")
public class UserSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//如何获取ajax发送过来的数据ajax其实会把数据拼在URL后面
		String name=request.getParameter("name");
		String pad=request.getParameter("pad");
		//调用service查询数据库
		String json="";
		if("张三".equals(name)&&"123456".equals(pad)) {
			//登录成功
			json="{\"mess\":true}";
		}else {
			//登录失败
			json="{\"mess\":false}";		}
		//把需要发送给客户端的信息响应给客户端
		PrintWriter pw=response.getWriter();
		pw.println(json);
		pw.flush();
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
