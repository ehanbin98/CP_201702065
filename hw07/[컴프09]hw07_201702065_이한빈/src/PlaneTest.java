
public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1,p2;
		p1 = new Plane("아시아나",35);
		p2 = new Plane ("대한항공","보잉703",2000);
		p1.print();
		p2.print();
		
		int n = Plane.getPlanes();
		System.out.println("비행기의 수 : "+n);
	}

}
