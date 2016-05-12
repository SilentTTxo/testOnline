package exam.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import exam.ex.Score;
import exam.ex.ScoreDAO;
import exam.ex.Seuview;
import exam.ex.SeuviewDAO;
import exam.ex.SeuviewId;

public class ScoreAction {
	
	private SeuviewDAO seuviewDAO;
	private List<SeuviewId> score;
	
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		List<Seuview> temp = null;
		if((Integer)session.getAttribute("power")==2){
			temp = seuviewDAO.findAll();
		}
		else {
			temp = seuviewDAO.findByProperty("id.userid", (Integer)session.getAttribute("userid"));
		}
		
		score = new ArrayList<SeuviewId>();
		for(Seuview xx : temp){
			score.add(xx.getId());
		}
		if((Integer)session.getAttribute("power")==2) return "ADMIN";
		return "SUCCESS";
	}

	public SeuviewDAO getSeuviewDAO() {
		return seuviewDAO;
	}

	public void setSeuviewDAO(SeuviewDAO seuviewDAO) {
		this.seuviewDAO = seuviewDAO;
	}

	public List<SeuviewId> getScore() {
		return score;
	}

	public void setScore(List<SeuviewId> score) {
		this.score = score;
	}

}
