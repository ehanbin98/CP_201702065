import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double h;
		double w;
		double v;
		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�:");
		r = input.nextDouble();
		w =3.141592*r*r;
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		h = input.nextDouble();
		v = w * h;
		System.out.println("������� ���Ǵ� "+v+"�Դϴ�.");
		
		
		
	}

}
