import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int 오백원;
		int 백원;
		int 오십원;
		int 십원;
		int 금액;
		System.out.println("저금통 액수 계산 프로그램");
		System.out.print("500원의 갯수 : ");
		오백원 = input.nextInt();
		System.out.print("100원의 갯수: ");
		백원 = input.nextInt();
		System.out.print("50원의 갯수: ");
		오십원 = input.nextInt();
		System.out.print("10원의 갯수: ");
		십원 = input.nextInt();
		금액 = 오백원 * 500 + 백원 * 100 + 오십원 * 50 + 십원 * 10;
		System.out.println("금액은 " + 금액 + "원입니다.");

	}

}
