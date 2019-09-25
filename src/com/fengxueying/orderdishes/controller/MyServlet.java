package com.fengxueying.orderdishes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fengxueying.orderdishes.dao.MyDao;
/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("来到了myservlet");
		String queryString = request.getQueryString();
//		System.out.println(queryString);
		//做一些切割字符串
		String showSumString = queryString.split("&")[0];
		//把string转化为int
		int showSum = Integer.parseInt(showSumString);
//		System.out.println("showSum"+showSum);
		String menuMenu = queryString.split("&")[1];
//		System.out.println("menuMenu"+menuMenu);
		//调用dao层执行插入操作
		MyDao myDao = new MyDao();
		myDao.save(menuMenu, showSum);
		
	}

}
