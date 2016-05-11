package exam.ex;

import java.sql.Timestamp;

/**
 * SeuviewId entity. @author MyEclipse Persistence Tools
 */
public class SeuviewId extends AbstractSeuviewId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeuviewId() {
	}

	/** full constructor */
	public SeuviewId(Timestamp emddate, String exname, Integer userid,
			String username, Integer sco) {
		super(emddate, exname, userid, username, sco);
	}

}
