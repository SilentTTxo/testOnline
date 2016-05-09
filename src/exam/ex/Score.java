package exam.ex;

import exam.ex.User;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */
public class Score extends AbstractScore implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** full constructor */
	public Score(Exam exam, User user, Integer sco) {
		super(exam, user, sco);
	}

}
