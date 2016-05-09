package exam.ex;

import exam.ex.User;

/**
 * AbstractScore entity provides the base persistence definition of the Score
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScore implements java.io.Serializable {

	// Fields

	private Integer id;
	private Exam exam;
	private User user;
	private Integer sco;

	// Constructors

	/** default constructor */
	public AbstractScore() {
	}

	/** full constructor */
	public AbstractScore(Exam exam, User user, Integer sco) {
		this.exam = exam;
		this.user = user;
		this.sco = sco;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getSco() {
		return this.sco;
	}

	public void setSco(Integer sco) {
		this.sco = sco;
	}

}