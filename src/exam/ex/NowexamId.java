package exam.ex;

import java.sql.Timestamp;

/**
 * NowexamId entity. @author MyEclipse Persistence Tools
 */
public class NowexamId extends AbstractNowexamId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public NowexamId() {
	}

	/** minimal constructor */
	public NowexamId(Integer id) {
		super(id);
	}

	/** full constructor */
	public NowexamId(Integer id, String name, Timestamp startdate,
			Timestamp emddate) {
		super(id, name, startdate, emddate);
	}

}
