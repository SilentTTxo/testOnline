package exam.ex;

/**
 * AbstractAllexam entity provides the base persistence definition of the
 * Allexam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAllexam implements java.io.Serializable {

	// Fields

	private AllexamId id;

	// Constructors

	/** default constructor */
	public AbstractAllexam() {
	}

	/** full constructor */
	public AbstractAllexam(AllexamId id) {
		this.id = id;
	}

	// Property accessors

	public AllexamId getId() {
		return this.id;
	}

	public void setId(AllexamId id) {
		this.id = id;
	}

}