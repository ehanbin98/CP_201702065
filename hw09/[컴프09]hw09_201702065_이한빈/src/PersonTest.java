
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1,c2;
		c1 = new Customer(1,100);
		c2 = new Customer();
		c1.setPerson("언유재","충남대학교 공대 5호관 연구실","010-1357-2468");
		c2.setName("이마너");
		c2.setAddress("충남대학교 공대 5호관 412호");
		c1.print();
		c2.print();
		
	}

}
