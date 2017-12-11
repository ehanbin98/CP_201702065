
public class Person {
	public String name;
	public String address;
	public String phone;

	public Person() {
		name = "����";
		address = "���";
		phone = "����";
	}

	public Person(String n, String a, String p) {
		setPerson(n, a, p);
	}

	public Person(String n, String p) {
		setPerson(n, "���", p);
	}

	public void setPerson(String n, String a, String p) {
		this.name = n;
		this.address = a;
		this.phone = p;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setPhone(String p) {
		phone = p;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	public void print() {
		System.out.println("�̸� : "+this.getName());
		System.out.println("�ּ� : "+this.getAddress());
		System.out.println("��ȭ��ȣ : "+this.getPhone());
	}
}

class Customer extends Person {
	public int customNumber;
	public int mileage;

	public Customer() {
		customNumber = 0;
		mileage = 0;
	}
	public Customer(int c,int m) {
		customNumber = c;
		mileage = m;
	}
	public void setCustomNumber(int c) {
		customNumber = c;
	}
	public void setMileage(int m) {
		mileage = m;
	}
	public int getCustomNumber() {
		return customNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void print() {
		super.print();
		System.out.println("�� ��ȣ : "+this.getCustomNumber());
		System.out.println("���ϸ��� : "+this.getMileage());
		System.out.println();
	}
}
