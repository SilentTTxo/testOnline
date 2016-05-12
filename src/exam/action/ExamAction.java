package exam.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;

import exam.ex.AllexamDAO;
import exam.ex.Exam;
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

	private int delexamid = -1;
	public int getDelexamid() {
		return delexamid;
	}

	public void setDelexamid(int delexamid) {
		this.delexamid = delexamid;
	}

	private int admin = -1;
	private List<Nowexam> examList;
	private NowexamDAO nowexamDAO;
	private List<NowexamId> examidList;
	private ScoreDAO scoreDAO;
	private UserDAO userDAO;
	private Exam exam;
	private ExamDAO examDAO;
	
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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public ExamDAO getExamDAO() {
		return examDAO;
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
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

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
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
			url = "login.html";
			message = "请先登录！";
			return "ERROR";
		}
		if(admin == 1 && exam != null){
			examDAO.save(exam);
		}
		if((Integer)session.getAttribute("power")==2 && delexamid != -1){
			examDAO.delete(examDAO.findById(delexamid));
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
		if((Integer)session.getAttribute("power")==2 && admin == 1) return "ADMIN";
		return "SUCCESS";
	}

	public List<NowexamId> getExamidList() {
		return examidList;
	}

}
