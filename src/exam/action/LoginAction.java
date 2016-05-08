package exam.action;

import exam.user.UserDAO;
import exam.user.User;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginAction {
	private String username;
	private String password;
	private UserDAO userDAO;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public LoginAction(){	
	}
	public String execute() throws Exception {
		/*if(getUsername().length() == 0){
			return "ERROR";
		}
		else {
			return "SUCCESS";
		}*/
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserDAO xxx =  (UserDAO)ac.getBean("UserDAO");
		System.out.println(" dao --> "+ xxx);
		userDAO = xxx;*/
		List<User> userList = userDAO.findAll();
		for(User temp:userList){
			if(temp.getUsername().equals(username)&&temp.getPassword().equals(password)){
				return "SUCCESS";
			}
		}
		setMessage("账号密码错误");
		return "ERROR";
	}
}
