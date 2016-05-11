package exam.action;

import java.util.List;

import exam.ex.Question;
import exam.ex.QuestionDAO;

public class QuestionAction {
	
	private int cmd = 1;
	private int delid;
	private String message;
	private String url;
	private QuestionDAO questionDAO;
	private List<Question> questions;
	private Question question;

	public String execute() throws Exception {
		if(cmd == 1){//查询
			questions = questionDAO.findAll();
			return "SUCCESS";
		}
		if(cmd == 2){//删除
			Question temp = questionDAO.findById(delid);
			try{
				questionDAO.delete(temp);
			}catch(Exception e){
				url="Question";
				message = "请先删除关联考试";
				return "ERROR";
			}
			
			return "SUCCESS";
		}
		if(cmd == 3){//添加
			if(question.getAnsc()==null) question.setAnsc("T_NULL");
			if(question.getAnsd()==null) question.setAnsd("T_NULL");
			if(question.getAnse()==null) question.setAnse("T_NULL");
			questionDAO.save(question);
			return "SUCCESS";
		}
		return "ERROR";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public int getDelid() {
		return delid;
	}

	public void setDelid(int delid) {
		this.delid = delid;
	}

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
