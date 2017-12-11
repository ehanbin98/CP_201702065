
public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 6; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i > 1; i--) {
			for (int j = i - 1; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i - 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
