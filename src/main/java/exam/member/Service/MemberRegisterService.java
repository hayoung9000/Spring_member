package exam.member.Service;

import exam.member.VO.RegisterRequest;

public interface MemberRegisterService {
	//UI화면에 입력한 정보에 대한 등록 서비스
	public void regist(RegisterRequest req);
}
