
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1,c2;
		c1 = new Customer(1,100);
		c2 = new Customer();
		c1.setPerson("������","�泲���б� ���� 5ȣ�� ������","010-1357-2468");
		c2.setName("�̸���");
		c2.setAddress("�泲���б� ���� 5ȣ�� 412ȣ");
		c1.print();
		c2.print();
		
	}

}
