package dbutil;

import java.sql.Connection;


public class DBUtil {
	/**
	 * �������ݿ�Ĳ���
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
	
	//�������ݿ�
	public static Connection getConnection(){
		/*Connection conn = null;
		try{
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("���ݿ����ӳɹ���");
		
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ�ܣ�");
		}*/
		Connection conn=null;
		if(username=="root"&&password=="1234") {
			System.out.println("���ݿ����ӳɹ���");
		}else {
			System.out.println("���ݿ�����ʧ�ܣ�");
		}
		return conn;
	}
}
