package dao;

import java.sql.Connection;

import dbutil.DBUtil;

public class UserDao {
	private DBUtil db;
	//�����ṩ���û����������ж��û��Ƿ����
	public boolean findUser(String userName,String passWord) {
		Connection conn=db.getConnection();
		if(userName=="abc"&&passWord=="123") {
		System.out.println("���ҵ����û���");
		return true;
		}else {
			System.out.println("δ�ҵ����û���");
			return false;
		}
		
	}

}
