package exam.ex;

/**
 * AbstractNowexam entity provides the base persistence definition of the
 * Nowexam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNowexam implements java.io.Serializable {

	// Fields

	private NowexamId id;

	// Constructors

	/** default constructor */
	public AbstractNowexam() {
	}

	/** full constructor */
	public AbstractNowexam(NowexamId id) {
		this.id = id;
	}

	// Property accessors

	public NowexamId getId() {
		return this.id;
	}

	public void setId(NowexamId id) {
		this.id = id;
	}

}