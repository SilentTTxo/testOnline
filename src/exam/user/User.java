package exam.user;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String password, String sex, String name,
			String tel, String email, Integer power, String other) {
		super(username, password, sex, name, tel, email, power, other);
	}

}
