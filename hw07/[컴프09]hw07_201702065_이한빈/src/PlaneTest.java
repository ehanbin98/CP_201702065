
public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1,p2;
		p1 = new Plane("�ƽþƳ�",35);
		p2 = new Plane ("�����װ�","����703",2000);
		p1.print();
		p2.print();
		
		int n = Plane.getPlanes();
		System.out.println("������� �� : "+n);
	}

}
