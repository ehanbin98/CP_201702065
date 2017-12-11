
public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		학부생 h1 = new 학부생("무소속");
		조교 j1 = new 조교("교육조교",0.6);
		j1.setName("정상문");
		j1.setGrade(2);
		j1.setMajor("컴퓨터공학");
		j1.setNumber(135792468);
		j1.setScore("A+");
		h1.setName("이한빈");
		h1.setGrade(1);
		h1.setMajor("컴퓨터공학");
		h1.setNumber(201702065);
		h1.setScore("A0");		
		j1.print();
		System.out.println();
		h1.print();
	}
}
