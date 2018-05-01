package exam.member.UI;

import java.util.Scanner;

import exam.member.Service.ChangePassWordService;
import exam.member.Service.MemberListPrinterService;
import exam.member.Service.MemberRegisterService;
import exam.member.VO.RegisterRequest;

public class MemberUI {
	//ui-> service로 연결 -> setter메서드로 주입
	MemberRegisterService memberRegisterService;
	//UI화면에서 목록 출력하기 , setter 메서드 주입하기 위해서 추가
	MemberListPrinterService memberListPrinterService;
	//UI 변경하기, setter 메서드를 통해서 주입
	ChangePassWordService changePasswordService;

	//setter 메서드 추가
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	//출력하기 위한 setter 메서드 추가
	public void setMemberListPrinterService(MemberListPrinterService memberListPrinterService) {
		this.memberListPrinterService = memberListPrinterService;
	}
	//변경하기 위한 setter 메서드 추가
	public void setChangePasswordService(ChangePassWordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}

	//메서드추가 --> 메뉴 목록을 만들기위한
	//new 이메일 이름 비번 비번1
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("명령어를 입력하세요>>");
		String command="";
		command = sc.nextLine();
		if(command.equalsIgnoreCase("exit")) {
			System.out.println("종료합니다");
			break;
		}else if(command.toLowerCase().startsWith("new ")) {
			processNewCommand(command.split(" "));
			continue;
		}else if(command.equalsIgnoreCase("list")) {
			processListCommad(); //list처리할 메서드
			continue;
		}else  if(command.toLowerCase().startsWith("change ")) {
			processChangeCommand(command.split(" "));
			continue;
		}
	  }
	}
	private void processChangeCommand(String[] args) {
		if(args.length!=4) {
			return;
		}
		changePasswordService.changePassword(args[1], args[2], args[3]);
		System.out.println("암호를 변경했습니다");
	}
	
	private void processListCommad() {
		memberListPrinterService.printAll();
	}
	
	private void processNewCommand(String[] args) {
		if(args.length != 5) {
			return;
		}
		//vo에 있는 사용자가 요청한 정보
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		if(!req.isPasswordEqualToConfirmPassword()) {
			System.out.println("일치하지 않음");
			return;
		}else {
			memberRegisterService.regist(req);
			System.out.println("성공");
		}
		
	}
	
}