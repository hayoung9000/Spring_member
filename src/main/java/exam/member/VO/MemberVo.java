package exam.member.VO;

import java.util.Date;

public class MemberVo {
	//vo--> 프로젝트에서 사용할 데이터 형식 선언 => db에서 테이블에 들어갈 필드들 같은 거
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	
	public MemberVo(String email, String password, String name, Date registerDate) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			System.out.println("비번이 다름");
		}
		this.password=newPassword;
	}
	
	
	

}
