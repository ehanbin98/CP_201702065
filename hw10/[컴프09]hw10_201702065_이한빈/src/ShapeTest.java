import java.util.Scanner;

public class ShapeTest {
	private static Shape arrayOfShapes[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		make();
		setWidth();
		setHeight();
		printAll();
	}

	public static void make() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();

	}

	public static void setWidth() {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arrayOfShapes.length; i++) {
			switch (i) {
			case 0:
				System.out.print("사각형의 밑변의 길이를입력하세요: ");
				break;
			case 1:
				System.out.print("삼각형의 밑변의 길이를입력하세요: ");
				break;
			case 2:
				System.out.print("원의 반지름의 길이를 입력하세요: ");
				break;
			}

			arrayOfShapes[i].width = input.nextInt();

		}
	}

	public static void setHeight() {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < (arrayOfShapes.length) - 1; i++) {
			switch (i) {
			case 0:
				System.out.print("사각형의 높이를 입력하세요: ");
				break;
			case 1:
				System.out.print("삼각형의 높이를 입력하세요: ");
				break;
			}

			arrayOfShapes[i].height = input.nextInt();
		}

	}

	public static void printAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			switch (i) {
			case 0:
				System.out.print("사각형의 넓이: " + arrayOfShapes[i].area());
				break;
			case 1:
				System.out.print("삼각형의 넓이: " + arrayOfShapes[i].area());
				break;
			case 2:
				System.out.print("원의 넓이: " + arrayOfShapes[i].area());
				break;
			}

		}
	}
}
