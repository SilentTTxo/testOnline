package exam.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import exam.Rs;
import exam.ex.ExamDAO;
import exam.ex.Question;
import exam.ex.QuestionDAO;
import exam.ex.Score;
import exam.ex.ScoreDAO;
import exam.ex.User;

public class JudgeAction {
	
	private String url;
	private String message;
	private QuestionDAO questionDAO;
	private ScoreDAO scoreDAO;
	private ExamDAO examDAO;
	private List<Rs> rs;
	private int examId;
	
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		int score = 0;
		for(Rs temp:rs){
			Question xx = questionDAO.findById(temp.getId());
			if(temp.getAns()==null) continue;
			if(xx.getAns() == Integer.parseInt(temp.getAns())){
				score ++;
			}
		}
		Score sc = new Score();
		sc.setUser((User)session.getAttribute("user"));
		sc.setSco(score);
		sc.setExam(examDAO.findById(examId));
		scoreDAO.save(sc);
		message = "得分为："+score;
		url = "Exam";
		return "ERROR";
	}

	public ExamDAO getExamDAO() {
		return examDAO;
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}

	public ScoreDAO getScoreDAO() {
		return scoreDAO;
	}

	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getUrl() {
		System.out.println(url);
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

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

	public List<Rs> getRs() {
		return rs;
	}

	public void setRs(List<Rs> rs) {
		this.rs = rs;
	}
}
