package exam.ex;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Exam entity. @author MyEclipse Persistence Tools
 */
public class Exam extends AbstractExam implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Exam() {
	}

	/** full constructor */
	public Exam(String name, Timestamp startdate, Timestamp emddate,
			Set scores, Set exques) {
		super(name, startdate, emddate, scores, exques);
	}

}
