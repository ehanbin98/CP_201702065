package hw06;

import java.util.Scanner;

public class Login {
	Scanner input = new Scanner(System.in);
	public String ID, password, IDcheck, pwcheck;

	public void setAccount() {
		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�:");
		ID = input.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�:");
		password = input.nextLine();
	}

	public void checkAccount() {
		System.out.println("<�α���>");
		System.out.print("ID:");
		IDcheck = input.nextLine();
		System.out.print("PW:");
		pwcheck = input.nextLine();
		if (ID.equals(IDcheck)&&password.equals(pwcheck))
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
		else System.out.println("�α��ο� �����Ͽ����ϴ�.");


	}

}

