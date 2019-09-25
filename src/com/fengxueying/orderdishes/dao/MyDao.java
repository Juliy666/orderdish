package com.fengxueying.orderdishes.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.fengxueying.orderdishes.utils.JdbcUtil;

public class MyDao {
		public void save(String menuMenu,int showSum) {
			//1.连接
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			//插入语句
			String sql= "insert into orderdish (menuMenu,showSum) values (?,?)";
			//执行sql语句
			try {
				qr.update(sql, menuMenu,showSum);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
}
