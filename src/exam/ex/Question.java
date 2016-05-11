package exam.ex;

import java.util.Set;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */
public class Question extends AbstractQuestion implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(Integer ans) {
		super(ans);
	}

	/** full constructor */
	public Question(String dis, Integer ansnum, String ansa, String ansb,
			String ansc, String ansd, String anse, Integer ans, Set exques) {
		super(dis, ansnum, ansa, ansb, ansc, ansd, anse, ans, exques);
	}

}
