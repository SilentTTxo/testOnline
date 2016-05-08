package exam.user;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String sex;
	private String name;
	private String tel;
	private String email;
	private Integer power;
	private String other;

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** full constructor */
	public AbstractUser(String username, String password, String sex,
			String name, String tel, String email, Integer power, String other) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.power = power;
		this.other = other;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPower() {
		return this.power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

}