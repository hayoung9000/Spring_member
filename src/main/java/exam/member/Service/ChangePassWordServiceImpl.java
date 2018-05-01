package exam.member.Service;

import exam.member.Dao.MemberDao;
import exam.member.VO.MemberVo;

public class ChangePassWordServiceImpl implements ChangePassWordService {
	private MemberDao memberDao;
	
	public ChangePassWordServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		MemberVo member = memberDao.selectByEmail(email);
		if(member == null) {
			System.out.println("존재하지 않습니다");
		}
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);
		
	}

}
