package exam.ex;

/**
 * AbstractAllexamId entity provides the base persistence definition of the
 * AllexamId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAllexamId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String dis;
	private Integer ansnum;
	private String ansa;
	private String ansb;
	private String ansc;
	private String ansd;
	private String anse;
	private Integer exid;
	private Integer queid;

	// Constructors

	/** default constructor */
	public AbstractAllexamId() {
	}

	/** minimal constructor */
	public AbstractAllexamId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractAllexamId(Integer id, String dis, Integer ansnum,
			String ansa, String ansb, String ansc, String ansd, String anse,
			Integer exid, Integer queid) {
		this.id = id;
		this.dis = dis;
		this.ansnum = ansnum;
		this.ansa = ansa;
		this.ansb = ansb;
		this.ansc = ansc;
		this.ansd = ansd;
		this.anse = anse;
		this.exid = exid;
		this.queid = queid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDis() {
		return this.dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}

	public Integer getAnsnum() {
		return this.ansnum;
	}

	public void setAnsnum(Integer ansnum) {
		this.ansnum = ansnum;
	}

	public String getAnsa() {
		return this.ansa;
	}

	public void setAnsa(String ansa) {
		this.ansa = ansa;
	}

	public String getAnsb() {
		return this.ansb;
	}

	public void setAnsb(String ansb) {
		this.ansb = ansb;
	}

	public String getAnsc() {
		return this.ansc;
	}

	public void setAnsc(String ansc) {
		this.ansc = ansc;
	}

	public String getAnsd() {
		return this.ansd;
	}

	public void setAnsd(String ansd) {
		this.ansd = ansd;
	}

	public String getAnse() {
		return this.anse;
	}

	public void setAnse(String anse) {
		this.anse = anse;
	}

	public Integer getExid() {
		return this.exid;
	}

	public void setExid(Integer exid) {
		this.exid = exid;
	}

	public Integer getQueid() {
		return this.queid;
	}

	public void setQueid(Integer queid) {
		this.queid = queid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAllexamId))
			return false;
		AbstractAllexamId castOther = (AbstractAllexamId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getDis() == castOther.getDis()) || (this.getDis() != null
						&& castOther.getDis() != null && this.getDis().equals(
						castOther.getDis())))
				&& ((this.getAnsnum() == castOther.getAnsnum()) || (this
						.getAnsnum() != null && castOther.getAnsnum() != null && this
						.getAnsnum().equals(castOther.getAnsnum())))
				&& ((this.getAnsa() == castOther.getAnsa()) || (this.getAnsa() != null
						&& castOther.getAnsa() != null && this.getAnsa()
						.equals(castOther.getAnsa())))
				&& ((this.getAnsb() == castOther.getAnsb()) || (this.getAnsb() != null
						&& castOther.getAnsb() != null && this.getAnsb()
						.equals(castOther.getAnsb())))
				&& ((this.getAnsc() == castOther.getAnsc()) || (this.getAnsc() != null
						&& castOther.getAnsc() != null && this.getAnsc()
						.equals(castOther.getAnsc())))
				&& ((this.getAnsd() == castOther.getAnsd()) || (this.getAnsd() != null
						&& castOther.getAnsd() != null && this.getAnsd()
						.equals(castOther.getAnsd())))
				&& ((this.getAnse() == castOther.getAnse()) || (this.getAnse() != null
						&& castOther.getAnse() != null && this.getAnse()
						.equals(castOther.getAnse())))
				&& ((this.getExid() == castOther.getExid()) || (this.getExid() != null
						&& castOther.getExid() != null && this.getExid()
						.equals(castOther.getExid())))
				&& ((this.getQueid() == castOther.getQueid()) || (this
						.getQueid() != null && castOther.getQueid() != null && this
						.getQueid().equals(castOther.getQueid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getDis() == null ? 0 : this.getDis().hashCode());
		result = 37 * result
				+ (getAnsnum() == null ? 0 : this.getAnsnum().hashCode());
		result = 37 * result
				+ (getAnsa() == null ? 0 : this.getAnsa().hashCode());
		result = 37 * result
				+ (getAnsb() == null ? 0 : this.getAnsb().hashCode());
		result = 37 * result
				+ (getAnsc() == null ? 0 : this.getAnsc().hashCode());
		result = 37 * result
				+ (getAnsd() == null ? 0 : this.getAnsd().hashCode());
		result = 37 * result
				+ (getAnse() == null ? 0 : this.getAnse().hashCode());
		result = 37 * result
				+ (getExid() == null ? 0 : this.getExid().hashCode());
		result = 37 * result
				+ (getQueid() == null ? 0 : this.getQueid().hashCode());
		return result;
	}

}