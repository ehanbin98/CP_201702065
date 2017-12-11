
public class Employee {
	public String name;
	public int phone;
	public int income;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setPhone(int p) {
		phone = p;
	}
	public int getPhone() {
		return phone;
	}
	public void setIncome(int i) {
		income = i;
	}
	public int getIncome() {
		return income;
	}
	public void print() {
		System.out.println("직원의 이름 : " +name);
		System.out.println("직원의 전화번호  : "+phone);
		System.out.println("직원의 연봉 : "+income);
	}
}
