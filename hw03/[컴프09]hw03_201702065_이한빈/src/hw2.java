import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double Ű;
		double ü��;
		double ǥ��ü��;
		System.out.print("Ű�� �Է��ϼ���.");
		Ű = input.nextDouble();
		System.out.print("ü���� �Է��ϼ���.");
		ü�� = input.nextDouble();
		ǥ��ü�� = (Ű - 100) * 0.9;
		if (ü�� > ǥ��ü�� * 0.9)
			if (ü�� >= ǥ��ü�� * 1.1)
				System.out.println("��ü���Դϴ�.");
			else
				System.out.println("�����Դϴ�.");
		else
			System.out.println("��ü���Դϴ�.");
	}

}
