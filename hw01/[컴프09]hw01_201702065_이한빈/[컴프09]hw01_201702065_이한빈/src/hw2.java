import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C;
		double F;
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ�:");
		F = input.nextDouble();
		C = 5 * (F - 32) / 9;
		System.out.println("�����µ� :" + C);
	}

}
