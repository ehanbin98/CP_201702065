import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cm;
		double fit;
		double inch;
		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ�:");
		cm = input.nextDouble();
		fit = cm/(2.54*12);
		inch = (cm/2.54)-((int)fit*12);
		System.out.println((int)cm+"cm�� "+(int)fit+"��Ʈ "+inch+"��ġ�Դϴ�.");	
	}

}
