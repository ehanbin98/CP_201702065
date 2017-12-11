import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double h;
		double w;
		double v;
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오:");
		r = input.nextDouble();
		w =3.141592*r*r;
		System.out.print("원기둥의 높이를 입력하시오: ");
		h = input.nextDouble();
		v = w * h;
		System.out.println("원기둥의 부피는 "+v+"입니다.");
		
		
		
	}

}
