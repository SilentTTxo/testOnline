package exam.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;

import exam.ex.AllexamDAO;
import exam.ex.ExamDAO;
import exam.ex.Nowexam;
import exam.ex.NowexamDAO;
import exam.ex.NowexamId;
import exam.ex.Score;
import exam.ex.ScoreDAO;
import exam.ex.UserDAO;

public class ExamAction {
	
	public List getExamList() {
		return examList;
	}

	public void setExamList(List examList) {
		this.examList = examList;
	}

	private List<Nowexam> examList;
	private NowexamDAO nowexamDAO;
	private List<NowexamId> examidList;
	private ScoreDAO scoreDAO;
	private UserDAO userDAO;
	
	public ScoreDAO getScoreDAO() {
		return scoreDAO;
	}

	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}

	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	private String message;
	
	public NowexamDAO getNowexamDAO() {
		return nowexamDAO;
	}

	public void setNowexamDAO(NowexamDAO nowexamDAO) {
		this.nowexamDAO = nowexamDAO;
	}

	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session.getAttribute("username")==null){
			url = "www.baidu.com";
			message = "请先登录！";
			return "ERROR";
		}
		examList = nowexamDAO.findAll();
		examidList = new ArrayList<NowexamId>();
		List<Score> sc = scoreDAO.findByProperty("user", userDAO.findById(Integer.parseInt(session.getAttribute("userid").toString())));
		for(Nowexam temp:examList){
			boolean key = true;
			for(Score xx : sc){
				if(xx.getExam().getId() == temp.getId().getId()){
					key = false;break;
				}
			}
			if(key) examidList.add(temp.getId());
		}
		return "SUCCESS";
	}

	public List<NowexamId> getExamidList() {
		return examidList;
	}

}
