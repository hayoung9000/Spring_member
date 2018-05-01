package exam.member.Dao;

import java.util.Collection;

import exam.member.VO.MemberVo;

public interface MemberDao {
	//email 기준으로 조회
	public MemberVo selectByEmail(String Email);
	//insert
	public void insert(MemberVo member);
	//update
	public void update(MemberVo member);
	//전체 조회
	public Collection<MemberVo> selectAll();
}
