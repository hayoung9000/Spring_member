package exam.member.VO;

public class RegisterRequest {
	//요청들어오는 정보에 대해서 관리
	
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	
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


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//추가 기능이 들어가는 메서드 --> 비번 2번 입력을 체크
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}

}
