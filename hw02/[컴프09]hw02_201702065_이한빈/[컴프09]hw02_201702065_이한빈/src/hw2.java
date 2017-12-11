import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	double 평;
	double 평방미터;
	System.out.println("단위 변환 프로그램");
	System.out.println("1평 ="+(1/3.3058)+"평방미터");
	System.out.print("평을 입력하십시오: ");
	평 = input.nextDouble();
	평방미터 = 평/3.3058;
	System.out.println(평+"은 "+평방미터+"평방미터 입니다.");
	}

}
