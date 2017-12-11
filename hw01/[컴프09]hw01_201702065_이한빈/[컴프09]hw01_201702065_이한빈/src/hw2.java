import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C;
		double F;
		Scanner input = new Scanner(System.in);
		System.out.print("È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À:");
		F = input.nextDouble();
		C = 5 * (F - 32) / 9;
		System.out.println("¼·¾¾¿Âµµ :" + C);
	}

}
