package exam.ex;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractQuestion entity provides the base persistence definition of the
 * Question entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQuestion implements java.io.Serializable {

	// Fields

	private Integer id;
	private String dis;
	private Integer ansnum;
	private String ansa;
	private String ansb;
	private String ansc;
	private String ansd;
	private String anse;
	private Set exques = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractQuestion() {
	}

	/** full constructor */
	public AbstractQuestion(String dis, Integer ansnum, String ansa,
			String ansb, String ansc, String ansd, String anse, Set exques) {
		this.dis = dis;
		this.ansnum = ansnum;
		this.ansa = ansa;
		this.ansb = ansb;
		this.ansc = ansc;
		this.ansd = ansd;
		this.anse = anse;
		this.exques = exques;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDis() {
		return this.dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}

	public Integer getAnsnum() {
		return this.ansnum;
	}

	public void setAnsnum(Integer ansnum) {
		this.ansnum = ansnum;
	}

	public String getAnsa() {
		return this.ansa;
	}

	public void setAnsa(String ansa) {
		this.ansa = ansa;
	}

	public String getAnsb() {
		return this.ansb;
	}

	public void setAnsb(String ansb) {
		this.ansb = ansb;
	}

	public String getAnsc() {
		return this.ansc;
	}

	public void setAnsc(String ansc) {
		this.ansc = ansc;
	}

	public String getAnsd() {
		return this.ansd;
	}

	public void setAnsd(String ansd) {
		this.ansd = ansd;
	}

	public String getAnse() {
		return this.anse;
	}

	public void setAnse(String anse) {
		this.anse = anse;
	}

	public Set getExques() {
		return this.exques;
	}

	public void setExques(Set exques) {
		this.exques = exques;
	}

}