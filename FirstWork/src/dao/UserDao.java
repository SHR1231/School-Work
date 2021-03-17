package dao;

import java.sql.Connection;

import dbutil.DBUtil;

public class UserDao {
	private DBUtil db;
	//根据提供的用户名和密码判断用户是否存在
	public boolean findUser(String userName,String passWord) {
		Connection conn=db.getConnection();
		if(userName=="abc"&&passWord=="123") {
		System.out.println("已找到该用户！");
		return true;
		}else {
			System.out.println("未找到该用户！");
			return false;
		}
		
	}

}
