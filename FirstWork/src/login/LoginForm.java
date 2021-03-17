package login;

import dao.UserDao;

public class LoginForm {
	private UserDao dao=new UserDao();
	private String userName;
	private String passWord;
	public LoginForm(String userName,String passWord) {
		this.userName=userName;
		this.passWord=passWord;
		init();
		display();
		validate(userName,passWord);
	}
	//��ʼ��
	public void init() {
		System.out.println("��ʼ���ɹ���");
	}
	
	//չʾҳ��
	public void display() {
		System.out.println("��ʾ�ɹ���");
	}
	
	//��֤�û�
	public void validate(String userName,String passWord) {
		if(dao.findUser(userName, passWord)==true) {
		System.out.println("�û���֤�ɹ���");
	}else {
		System.out.println("�û���֤ʧ�ܣ�");
	}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
