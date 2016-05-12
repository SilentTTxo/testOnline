package exam.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.SessionFactory;

import exam.Rs;
import exam.ex.Allexam;
import exam.ex.AllexamDAO;
import exam.ex.AllexamId;
import exam.ex.Exam;
import exam.ex.ExamDAO;
import exam.ex.Exque;
import exam.ex.ExqueDAO;
import exam.ex.Nowexam;
import exam.ex.NowexamDAO;
import exam.ex.NowexamId;
import exam.ex.Question;
import exam.ex.QuestionDAO;

public class testAction {
	
	private int queId = -1;
	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	private int delqueId = -1;
	private int examId = -1;
	private NowexamDAO nowexamDAO;
	private NowexamId exam;
	private AllexamDAO allexamDAO;
	private Allexam allexam;
	private ExqueDAO exqueDAO;
	private ExamDAO examDAO;
	private QuestionDAO questionDAO;
	private List<AllexamId> list;
	private List<Question> qlist;
	public ExqueDAO getExqueDAO() {
		return exqueDAO;
	}

	public void setExqueDAO(ExqueDAO exqueDAO) {
		this.exqueDAO = exqueDAO;
	}

	private String message;
	private String url;
	private SessionFactory sessionFactory;
	
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(delqueId != -1 && (Integer)session.getAttribute("power")==2){
			exqueDAO.delete(exqueDAO.findById(delqueId));
		}
		if(queId != -1 && (Integer)session.getAttribute("power")==2){
			Exque temp = new Exque();
			temp.setExam(examDAO.findById(examId));
			temp.setQuestion(questionDAO.findById(queId));
			exqueDAO.save(temp);
		}
		if((Integer)session.getAttribute("power")==2){
			String hql = "SELECT ID,DIS FROM QUESTION WHERE ID not in (SELECT QUEID from EXQUE where EXID = "+examId+")";
			List<Object[]> qqList = sessionFactory.openSession().createSQLQuery(hql).list();
			qlist = new ArrayList<Question>();
			for(Object[] tt : qqList){
				Question te = new Question();
				te.setId(Integer.parseInt((tt[0].toString())));
				te.setDis(tt[1].toString());
				qlist.add(te);
			}
		}
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
		if(examId != -1 && (Integer)session.getAttribute("power")==2){//修改考试题目
			return "ADMIN";
		}
		return "SUCCESS";
	}



	public int getDelqueId() {
		return delqueId;
	}

	public void setDelqueId(int delqueId) {
		this.delqueId = delqueId;
	}

	public ExamDAO getExamDAO() {
		return examDAO;
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

	public List<Question> getQlist() {
		return qlist;
	}

	public void setQlist(List<Question> qlist) {
		this.qlist = qlist;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
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
