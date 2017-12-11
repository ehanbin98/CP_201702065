import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mile;
		double km;
		System.out.print("마일을 입력하십시오.:");
		mile = input.nextDouble();
		km = 1.609 * mile;
		System.out.println((int)mile + "마일은 " + km + "킬로미터입니다.");

	}

}
