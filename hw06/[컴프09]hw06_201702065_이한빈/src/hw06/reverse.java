package hw06;

import java.util.Scanner;

public class reverse {
	Scanner input = new Scanner(System.in);
	public int a, l;
	public String str;

	public void plz () {
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		str = input.nextLine();
		l = str.length();
		for (a = 0;a<l;a++) {
			System.out.print(str.charAt(l-a-1));
		}

	}
}