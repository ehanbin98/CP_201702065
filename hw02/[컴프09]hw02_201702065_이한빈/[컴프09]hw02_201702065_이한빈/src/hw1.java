import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int �����;
		int ���;
		int ���ʿ�;
		int �ʿ�;
		int �ݾ�;
		System.out.println("������ �׼� ��� ���α׷�");
		System.out.print("500���� ���� : ");
		����� = input.nextInt();
		System.out.print("100���� ����: ");
		��� = input.nextInt();
		System.out.print("50���� ����: ");
		���ʿ� = input.nextInt();
		System.out.print("10���� ����: ");
		�ʿ� = input.nextInt();
		�ݾ� = ����� * 500 + ��� * 100 + ���ʿ� * 50 + �ʿ� * 10;
		System.out.println("�ݾ��� " + �ݾ� + "���Դϴ�.");

	}

}
