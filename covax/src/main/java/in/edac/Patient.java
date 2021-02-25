package in.edac;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String mobile;
	
	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	private int aadharNo;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable=false)
	private boolean isCoronaPositive;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, String username, String password, String email, String mobile, String address,
			int aadharNo, String state, String gender, boolean isCoronaPositive) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.aadharNo = aadharNo;
		this.state = state;
		this.gender = gender;
		this.isCoronaPositive = isCoronaPositive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isCoronaPositive() {
		return isCoronaPositive;
	}

	public void setCoronaPositive(boolean isCoronaPositive) {
		this.isCoronaPositive = isCoronaPositive;
	}

	
	
}
