
public class Person {
	public String name;
	public String address;
	public String phone;

	public Person() {
		name = "없음";
		address = "노숙";
		phone = "없음";
	}

	public Person(String n, String a, String p) {
		setPerson(n, a, p);
	}

	public Person(String n, String p) {
		setPerson(n, "노숙", p);
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
		System.out.println("이름 : "+this.getName());
		System.out.println("주소 : "+this.getAddress());
		System.out.println("전화번호 : "+this.getPhone());
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
		System.out.println("고객 번호 : "+this.getCustomNumber());
		System.out.println("마일리지 : "+this.getMileage());
		System.out.println();
	}
}
