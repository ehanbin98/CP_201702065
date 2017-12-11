import java.util.Scanner;

public class seatTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int finish = 0;
		int yes;
		String choice;
		String select;
		seat[] se = new seat[10];
		for (int i = 0; i < se.length; i++) {
			se[i] = new seat();
		}
		System.out.print("예약된 좌석 지정하기(10자리이진수): ");
		select = scan.nextLine();
		for (int a = 0; a < select.length(); a++) {
			char b = select.charAt(a);
			se[a].book = b;
		}
		while (finish == 0) {
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
			yes = scan.nextInt();
			if (yes == 1) {
				while (yes == 1) {

					System.out.println("현재의 예약 상태는 다음과 같습니다.");
					System.out.println("-------------------------------------------------");
					System.out.println("1 2 3 4 5 6 7 8 9 10");
					System.out.println("-------------------------------------------------");
					for (int i = 0; i < se.length; i++) {
						System.out.print(se[i].toString());
					}
					System.out.println();
					System.out.print("몇번째 좌석을 예약하시겠습니까? (나가기 = ~) ");
					choice = scan.nextLine();
					if (choice.length()==1)
						if (choice.charAt(0)=='1')
							if (se[0].book=='1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[0].book('1');
								System.out.println("예약되었습니다.");
							}
					if (choice.length()==2)
						if (choice.charAt(1)=='0')
							if (se[9].book=='1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[9].book('1');
								System.out.println("예약되었습니다.");
							}
					if (choice.length()>=3)
						if (choice.charAt(0)=='1')
							if (choice.charAt(choice.length()-1)=='0')
								if (se[9].book=='1') {
									if (se[0].book=='1')
										System.out.println("이미 예약된 좌석입니다.");}
								else {
									if (se[0].book=='0')
									se[9].book('1');
									se[0].book('1');
									System.out.println("예약되었습니다.");
								}
					for (int i = 0; i < choice.length(); i++) {
						switch (choice.charAt(i)) {
						case '2':
							if (se[1].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[1].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '3':
							if (se[2].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[2].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '4':
							if (se[3].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[3].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '5':
							if (se[4].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[4].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '6':
							if (se[5].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[5].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '7':
							if (se[6].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[6].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '8':
							if (se[7].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[7].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '9':
							if (se[8].book == '1')
								System.out.println("이미 예약된 좌석입니다.");
							else {
								se[8].book('1');
								System.out.println("예약되었습니다.");
							}
							break;
						case '~':
							yes += 1;
							break;

						}
					}
				}

			} else {
				System.out.print("종료");
				finish += 1;
			}
		}
	}
}
