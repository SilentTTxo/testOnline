package exam.ex;

/**
 * Exque entity. @author MyEclipse Persistence Tools
 */
public class Exque extends AbstractExque implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Exque() {
	}

	/** full constructor */
	public Exque(Question question, Exam exam) {
		super(question, exam);
	}

}
