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
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
			message = "请先登录！";
			return "ERROR";
		}
		examList = nowexamDAO.findAll();
		examidList = new ArrayList<NowexamId>();
		for(Nowexam temp:examList){
			examidList.add(temp.getId());
		}
		return "SUCCESS";
	}

	public List<NowexamId> getExamidList() {
		return examidList;
	}

}
