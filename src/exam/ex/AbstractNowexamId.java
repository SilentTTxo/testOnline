package exam.ex;

import java.sql.Timestamp;

/**
 * AbstractNowexamId entity provides the base persistence definition of the
 * NowexamId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNowexamId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Timestamp startdate;
	private Timestamp emddate;

	// Constructors

	/** default constructor */
	public AbstractNowexamId() {
	}

	/** minimal constructor */
	public AbstractNowexamId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractNowexamId(Integer id, String name, Timestamp startdate,
			Timestamp emddate) {
		this.id = id;
		this.name = name;
		this.startdate = startdate;
		this.emddate = emddate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public Timestamp getEmddate() {
		return this.emddate;
	}

	public void setEmddate(Timestamp emddate) {
		this.emddate = emddate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractNowexamId))
			return false;
		AbstractNowexamId castOther = (AbstractNowexamId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getStartdate() == castOther.getStartdate()) || (this
						.getStartdate() != null
						&& castOther.getStartdate() != null && this
						.getStartdate().equals(castOther.getStartdate())))
				&& ((this.getEmddate() == castOther.getEmddate()) || (this
						.getEmddate() != null && castOther.getEmddate() != null && this
						.getEmddate().equals(castOther.getEmddate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getStartdate() == null ? 0 : this.getStartdate().hashCode());
		result = 37 * result
				+ (getEmddate() == null ? 0 : this.getEmddate().hashCode());
		return result;
	}

}