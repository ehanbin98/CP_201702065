import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cm;
		double fit;
		double inch;
		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하시오:");
		cm = input.nextDouble();
		fit = cm/(2.54*12);
		inch = (cm/2.54)-((int)fit*12);
		System.out.println((int)cm+"cm는 "+(int)fit+"피트 "+inch+"인치입니다.");	
	}

}
