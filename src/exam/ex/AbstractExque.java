package exam.ex;

/**
 * AbstractExque entity provides the base persistence definition of the Exque
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExque implements java.io.Serializable {

	// Fields

	private Integer id;
	private Question question;
	private Exam exam;

	// Constructors

	/** default constructor */
	public AbstractExque() {
	}

	/** full constructor */
	public AbstractExque(Question question, Exam exam) {
		this.question = question;
		this.exam = exam;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

}