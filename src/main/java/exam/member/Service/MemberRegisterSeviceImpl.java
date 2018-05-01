package exam.member.Service;

import java.util.Date;

import exam.member.Dao.MemberDao;
import exam.member.VO.MemberVo;
import exam.member.VO.RegisterRequest;

public class MemberRegisterSeviceImpl implements MemberRegisterService{
	//MemberDao값으로 주입하기 위한 준비
	private MemberDao memberDao;
	
	//매개변수가 있는 생성자-> 주입공간
	public MemberRegisterSeviceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	@Override
	public void regist(RegisterRequest req) {
		MemberVo member = memberDao.selectByEmail(req.getEmail());
		//요청한 Email값을 member에 저장
		
		if(member!=null) {
			System.out.println("이미존재");
		}
		MemberVo newMember = new MemberVo(req.getEmail(),req.getPassword(),req.getName(),new Date()); //VO에 저장된 값을 가져와서  newMember로 설정
		
		memberDao.insert(newMember); //map 삽입
		
	}

	

}
