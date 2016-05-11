package exam.ex;

/**
 * AbstractSeuview entity provides the base persistence definition of the
 * Seuview entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeuview implements java.io.Serializable {

	// Fields

	private SeuviewId id;

	// Constructors

	/** default constructor */
	public AbstractSeuview() {
	}

	/** full constructor */
	public AbstractSeuview(SeuviewId id) {
		this.id = id;
	}

	// Property accessors

	public SeuviewId getId() {
		return this.id;
	}

	public void setId(SeuviewId id) {
		this.id = id;
	}

}