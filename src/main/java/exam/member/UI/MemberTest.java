package exam.member.UI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberTest {

	public static void main(String[] args) {
/*		MemberDao memberDao = new MeberDaoImpl();
		MemberRegisterService memberRegisterService = new MemberRegisterSeviceImpl(memberDao);
		MemberUI memberUI = new MemberUI();
		//setter메서드에 주입
		memberUI.setMemberRegisterService(memberRegisterService);
		memberUI.showMenu();*/
		
		//스프링으로 빈 생성해서 불러오기
		ApplicationContext ctx=new  GenericXmlApplicationContext("member.xml");
		MemberUI memberUI = ctx.getBean("memberUI",MemberUI.class);
		memberUI.showMenu();
	}

}
