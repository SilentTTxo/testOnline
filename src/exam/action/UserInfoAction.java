package exam.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import exam.ex.User;
import exam.ex.UserDAO;

public class UserInfoAction {
	
	private UserDAO userDAO;
	private User user;
	
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(user == null){
			user = userDAO.findById((Integer)session.getAttribute("userid"));
			return "SUCCESS";
		}
		try{
			user.setId((Integer)session.getAttribute("userid"));
			user.setUsername(session.getAttribute("username").toString());
			user.setPower((Integer)session.getAttribute("power"));
			userDAO.merge(user);
			return "SUCCESS";
		}
		catch(Exception e){
			return "ERROR";
		}
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
