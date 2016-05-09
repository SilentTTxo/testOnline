package exam.ex;

import java.util.Set;

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
			String tel, String email, Integer power, String other, Set scores) {
		super(username, password, sex, name, tel, email, power, other, scores);
	}

}
