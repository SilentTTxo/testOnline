package exam.ex;

/**
 * AllexamId entity. @author MyEclipse Persistence Tools
 */
public class AllexamId extends AbstractAllexamId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AllexamId() {
	}

	/** minimal constructor */
	public AllexamId(Integer id) {
		super(id);
	}

	/** full constructor */
	public AllexamId(Integer id, String dis, Integer ansnum, String ansa,
			String ansb, String ansc, String ansd, String anse, Integer queid,
			Integer exid) {
		super(id, dis, ansnum, ansa, ansb, ansc, ansd, anse, queid, exid);
	}

}
