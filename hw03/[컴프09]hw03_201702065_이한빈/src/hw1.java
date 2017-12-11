import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("숫자를 입력하십시오.");
		a = input.nextInt();
		System.out.print("숫자를 입력하십사오.");
		b = input.nextInt();
		System.out.print("숫자를 입려하십시오.");
		c = input.nextInt();
		if (a > b)
			if (a > c)
				if (b > c)
					System.out.println(a + "	" + b + "	" + c);
				else
					System.out.println(a + "	" + c + "	" + b);
			else
				System.out.println(c + "	" + a + "	" + b);
		else if (b > c)
			if (a > c)
				System.out.println(b + "	" + a + "	" + c);
			else
				System.out.println(b + "	" + c + "	" + a);
		else 
			System.out.println(c+"	"+b+"	"+a);
	}
}
