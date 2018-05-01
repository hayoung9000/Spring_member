package exam.member.Service;

import java.util.Collection;

import exam.member.Dao.MemberDao;
import exam.member.VO.MemberVo;

public class MemberListPrinterServiceImpl implements MemberListPrinterService{
	private MemberDao memberDao;
	private MemberPrintService memberPrinter;
	
	
	
	public MemberListPrinterServiceImpl(MemberDao memberDao, MemberPrintService memberPrinter) {
		super();
		this.memberDao = memberDao;
		this.memberPrinter = memberPrinter;
	}

	@Override
	public void printAll() {
		Collection<MemberVo> members = memberDao.selectAll();
		for(MemberVo member : members) {
			memberPrinter.print(member);
		}
	}
}
