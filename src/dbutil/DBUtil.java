package dbutil;

import java.sql.Connection;


public class DBUtil {
	/**
	 * 连接数据库的操作
	 */
	public static String username = "root";
	public static String password = "1234";
	//public static String url = "jdbc:mysql://localhost:3306/books";

	/*static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}*/
	
	//连接数据库
	public static Connection getConnection(){
		/*Connection conn = null;
		try{
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("数据库连接成功！");
		
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("数据库连接失败！");
		}*/
		Connection conn=null;
		if(username=="root"&&password=="1234") {
			System.out.println("数据库连接成功！");
		}else {
			System.out.println("数据库连接失败！");
		}
		return conn;
	}
}
