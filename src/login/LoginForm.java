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
	//初始化
	public void init() {
		System.out.println("初始化成功！");
	}
	
	//展示页面
	public void display() {
		System.out.println("显示成功！");
	}
	
	//验证用户
	public void validate(String userName,String passWord) {
		if(dao.findUser(userName, passWord)==true) {
		System.out.println("用户验证成功！");
	}else {
		System.out.println("用户验证失败！");
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
