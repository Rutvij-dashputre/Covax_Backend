package in.edac;

public class Login {

	private String username;
	private String password;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
}