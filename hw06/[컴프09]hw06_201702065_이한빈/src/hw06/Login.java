package hw06;

import java.util.Scanner;

public class Login {
	Scanner input = new Scanner(System.in);
	public String ID, password, IDcheck, pwcheck;

	public void setAccount() {
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오:");
		ID = input.nextLine();
		System.out.print("비밀번호를 입력하시오:");
		password = input.nextLine();
	}

	public void checkAccount() {
		System.out.println("<로그인>");
		System.out.print("ID:");
		IDcheck = input.nextLine();
		System.out.print("PW:");
		pwcheck = input.nextLine();
		if (ID.equals(IDcheck)&&password.equals(pwcheck))
				System.out.println("로그인에 성공하였습니다.");
		else System.out.println("로그인에 실패하였습니다.");


	}

}

