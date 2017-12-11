import java.util.Scanner;
public class seat {
	public char book;
	Scanner scan = new Scanner(System.in);
	public String toString () {
		return book+" ";
	}
	public char book () {
		return this.book;
	}
	public void book(char a) {
		book = a;
	}
	
}
