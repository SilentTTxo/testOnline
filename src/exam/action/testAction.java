package exam.action;

import java.util.ArrayList;
import java.util.List;

import exam.ex.Allexam;
import exam.ex.AllexamDAO;
import exam.ex.AllexamId;
import exam.ex.Exam;
import exam.ex.ExamDAO;
import exam.ex.Nowexam;
import exam.ex.NowexamDAO;
import exam.ex.NowexamId;

public class testAction {
	
	private int examId;
	private NowexamDAO nowexamDAO;
	private NowexamId exam;
	private AllexamDAO allexamDAO;
	private Allexam allexam;
	private List<AllexamId> list;
	private String message;
	private String url;
	
	public String execute() throws Exception {
		exam = ((Nowexam)nowexamDAO.findByProperty("id.id",examId).get(0)).getId();
		if(exam==null){
			url = "index.jsp";
			message = "考试不存在";
			return "ERROR";
		}
		list = new ArrayList<AllexamId>();
		List<Allexam> temp = allexamDAO.findByProperty("id.exid", examId);
		for(Allexam tt : temp){
			list.add(tt.getId());
		}
		return "SUCCESS";
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public NowexamDAO getNowexamDAO() {
		return nowexamDAO;
	}

	public void setNowexamDAO(NowexamDAO nowexamDAO) {
		this.nowexamDAO = nowexamDAO;
	}


	public AllexamDAO getAllexamDAO() {
		return allexamDAO;
	}

	public NowexamId getExam() {
		return exam;
	}

	public void setExam(NowexamId exam) {
		this.exam = exam;
	}

	public void setAllexamDAO(AllexamDAO allexamDAO) {
		this.allexamDAO = allexamDAO;
	}

	public Allexam getAllexam() {
		return allexam;
	}

	public void setAllexam(Allexam allexam) {
		this.allexam = allexam;
	}

	public List<AllexamId> getList() {
		return list;
	}

	public void setList(List<AllexamId> list) {
		this.list = list;
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
	
}
