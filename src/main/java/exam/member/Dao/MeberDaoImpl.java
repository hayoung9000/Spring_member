package exam.member.Dao;

import java.util.*;

import exam.member.VO.MemberVo;

public class MeberDaoImpl implements MemberDao{
	//메서드의 역활부여
	
	private static long nextId=0; //정적(클래스멤버)
	
	private Map<String, MemberVo> map = new HashMap<String, MemberVo>(); //데이터 저장하거나 조회할 때
	
	@Override
	public MemberVo selectByEmail(String Email) {
		return map.get(Email);
	}
	@Override
	public void insert(MemberVo member) {
		member.setId(++nextId);
		map.put(member.getEmail(),member); //Email에 대한 키 받기
	}
	@Override
	public void update(MemberVo member) {
		map.put(member.getEmail(),member);
	}
	@Override
	public Collection<MemberVo> selectAll() {
		return map.values();//map에 있는 값 모두 출력
	} 
	
	
}
