
public class student {
	public String name;
	public int number;
	public String major;
	public int grade;
	public String score;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int n) {
		number = n;
	}
	public int getNumber() {
		return number;
	}
	public void setMajor(String m) {
		major = m;
	}
	public String getMajor () {
		return major;
	}
	public void setGrade(int g) {
		grade = g;
	}
	public int getGrade() {
		return grade;
	}
	public void setScore(String s) {
		score = s;
	}
	public String getScore() {
		return score;
	}
	public void print() {
		System.out.println("�̸� :" +this.getName());
		System.out.println("�й� :"+this.getNumber());
		System.out.println("�а� :"+this.getMajor());
		System.out.println("�г� :"+this.getGrade());
		System.out.println("�̼����� :"+this.getScore());
	}
}	
class �кλ� extends student{
	
	public String club;
	public void setClub(String c) {
		club = c;
	}
	public �кλ�(String c) {
		club = c;
	}
	public String getClub() {
		return club;
	}
	public void print() {
		super.print();
		System.out.println("���Ƹ��� : " +this.getClub());
	}
}
class ���� extends student{
	public String type;
	public double percentage;
	public void setType(String t) {
		type =t;
	}
	public String getType() {
		return type;
	}
	public ����(String t,double p) {
		type = t;
		percentage = p;
	}
	public void setPercentage(double p) {
		percentage = p;
	}
	public double getPercentage() {
		return percentage;
	}
	public void print() {
		super.print();
		System.out.println("���� ���� : "+this.getType());
		System.out.println("���б� ���� : "+this.getPercentage());
	}
}
