import java.util.Scanner;
import java.util.Random;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(System.currentTimeMillis());
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		System.out.println("<로또  생성 프로그램>");
		num1 = rand.nextInt(45);
		num2 = rand.nextInt(45);
		num3 = rand.nextInt(45);
		num4 = rand.nextInt(45);
		num5 = rand.nextInt(45);
		num6 = rand.nextInt(45);
		for (int i = 0; i < 6; i++) {
			while (num1 == num2)
				num2 = rand.nextInt(45);
			while (num1 == num3)
				num3 = rand.nextInt(45);
			while (num1 == num4)
				num4 = rand.nextInt(45);
			while (num1 == num5)
				num5 = rand.nextInt(45);
			while (num1 == num6)
				num6 = rand.nextInt(45);
			while (num2 == num3)
				num3 = rand.nextInt(45);
			while (num2 == num4)
				num4 = rand.nextInt(45);
			while (num2 == num5)
				num5 = rand.nextInt(45);
			while (num2 == num6)
				num6 = rand.nextInt(45);
			while (num3 == num4)
				num4 = rand.nextInt(45);
			while (num3 == num5)
				num5 = rand.nextInt(45);
			while (num3 == num6)
				num6 = rand.nextInt(45);
			while (num4 == num5)
				num5 = rand.nextInt(45);
			while (num4 == num6)
				num6 = rand.nextInt(45);
			while (num5 == num6)
				num6 = rand.nextInt(45);

		}

		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				System.out.print(num1 + 1);
				break;
			case 1:
				System.out.print(" " + (num2 + 1));
				break;
			case 2:
				System.out.print(" " + (num3 + 1));
				break;
			case 3:
				System.out.print(" " + (num4 + 1));
				break;
			case 4:
				System.out.print(" " + (num5 + 1));
				break;
			case 5:
				System.out.print(" " + (num6 + 1));
				break;
			}
		}
	}

}