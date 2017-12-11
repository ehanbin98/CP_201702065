import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double 키;
		double 체중;
		double 표준체중;
		System.out.print("키를 입력하세요.");
		키 = input.nextDouble();
		System.out.print("체중을 입력하세요.");
		체중 = input.nextDouble();
		표준체중 = (키 - 100) * 0.9;
		if (체중 > 표준체중 * 0.9)
			if (체중 >= 표준체중 * 1.1)
				System.out.println("과체중입니다.");
			else
				System.out.println("정상입니다.");
		else
			System.out.println("저체중입니다.");
	}

}
