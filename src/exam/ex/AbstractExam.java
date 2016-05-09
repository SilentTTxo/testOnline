package exam.ex;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractExam entity provides the base persistence definition of the Exam
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExam implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Timestamp startdate;
	private Timestamp emddate;
	private Set scores = new HashSet(0);
	private Set exques = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractExam() {
	}

	/** full constructor */
	public AbstractExam(String name, Timestamp startdate, Timestamp emddate,
			Set scores, Set exques) {
		this.name = name;
		this.startdate = startdate;
		this.emddate = emddate;
		this.scores = scores;
		this.exques = exques;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public Timestamp getEmddate() {
		return this.emddate;
	}

	public void setEmddate(Timestamp emddate) {
		this.emddate = emddate;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

	public Set getExques() {
		return this.exques;
	}

	public void setExques(Set exques) {
		this.exques = exques;
	}

}