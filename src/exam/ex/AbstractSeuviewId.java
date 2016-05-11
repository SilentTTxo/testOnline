package exam.ex;

import java.sql.Timestamp;

/**
 * AbstractSeuviewId entity provides the base persistence definition of the
 * SeuviewId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeuviewId implements java.io.Serializable {

	// Fields

	private Timestamp emddate;
	private String exname;
	private Integer userid;
	private String username;
	private Integer sco;

	// Constructors

	/** default constructor */
	public AbstractSeuviewId() {
	}

	/** full constructor */
	public AbstractSeuviewId(Timestamp emddate, String exname, Integer userid,
			String username, Integer sco) {
		this.emddate = emddate;
		this.exname = exname;
		this.userid = userid;
		this.username = username;
		this.sco = sco;
	}

	// Property accessors

	public Timestamp getEmddate() {
		return this.emddate;
	}

	public void setEmddate(Timestamp emddate) {
		this.emddate = emddate;
	}

	public String getExname() {
		return this.exname;
	}

	public void setExname(String exname) {
		this.exname = exname;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getSco() {
		return this.sco;
	}

	public void setSco(Integer sco) {
		this.sco = sco;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSeuviewId))
			return false;
		AbstractSeuviewId castOther = (AbstractSeuviewId) other;

		return ((this.getEmddate() == castOther.getEmddate()) || (this
				.getEmddate() != null && castOther.getEmddate() != null && this
				.getEmddate().equals(castOther.getEmddate())))
				&& ((this.getExname() == castOther.getExname()) || (this
						.getExname() != null && castOther.getExname() != null && this
						.getExname().equals(castOther.getExname())))
				&& ((this.getUserid() == castOther.getUserid()) || (this
						.getUserid() != null && castOther.getUserid() != null && this
						.getUserid().equals(castOther.getUserid())))
				&& ((this.getUsername() == castOther.getUsername()) || (this
						.getUsername() != null
						&& castOther.getUsername() != null && this
						.getUsername().equals(castOther.getUsername())))
				&& ((this.getSco() == castOther.getSco()) || (this.getSco() != null
						&& castOther.getSco() != null && this.getSco().equals(
						castOther.getSco())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmddate() == null ? 0 : this.getEmddate().hashCode());
		result = 37 * result
				+ (getExname() == null ? 0 : this.getExname().hashCode());
		result = 37 * result
				+ (getUserid() == null ? 0 : this.getUserid().hashCode());
		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getSco() == null ? 0 : this.getSco().hashCode());
		return result;
	}

}