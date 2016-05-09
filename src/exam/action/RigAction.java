package exam.action;

import exam.ex.User;
import exam.ex.UserDAO;

public class RigAction {
	private User user;
	private UserDAO userDAO;
	private String message;
	
	public RigAction(){}
	public String execute() throws Exception {
		try {
			if(!userDAO.findByUsername(user.getUsername()).isEmpty()){
				message = "用户已存在，请修改用户名";
				return "ERROR";
			}
			user.setPower(1);
			userDAO.save(user);
			return "SUCCESS";
		} catch (Exception e) {
			// TODO: handle exception
			message = e.toString();
			message += "test";
			return "ERROR";
		}
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
