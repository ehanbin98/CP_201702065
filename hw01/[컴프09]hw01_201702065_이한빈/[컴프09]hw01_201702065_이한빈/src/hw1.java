import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mile;
		double km;
		System.out.print("������ �Է��Ͻʽÿ�.:");
		mile = input.nextDouble();
		km = 1.609 * mile;
		System.out.println((int)mile + "������ " + km + "ų�ι����Դϴ�.");

	}

}
