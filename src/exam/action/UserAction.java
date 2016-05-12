package exam.action;

import java.util.List;

import exam.ex.User;
import exam.ex.UserDAO;

public class UserAction {
	
	private UserDAO userDAO;
	private User user;
	private List<User> users;
	private int userid = -1;
	private int isadd = -1;
	
	public String execute() throws Exception {
		if(userid!=-1){
			if(isadd == -1){
				userDAO.delete(userDAO.findById(userid));
			}
			if(isadd == 9){
				user = userDAO.findById(userid);
				user.setPower(2);
				userDAO.merge(user);
			}
		}
		users = userDAO.findAll();
		return "ADMIN";
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getIsadd() {
		return isadd;
	}

	public void setIsadd(int isadd) {
		this.isadd = isadd;
	}

}
