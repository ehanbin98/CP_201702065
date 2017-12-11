
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
		System.out.println("이름 :" +this.getName());
		System.out.println("학번 :"+this.getNumber());
		System.out.println("학과 :"+this.getMajor());
		System.out.println("학년 :"+this.getGrade());
		System.out.println("이수학점 :"+this.getScore());
	}
}	
class 학부생 extends student{
	
	public String club;
	public void setClub(String c) {
		club = c;
	}
	public 학부생(String c) {
		club = c;
	}
	public String getClub() {
		return club;
	}
	public void print() {
		super.print();
		System.out.println("동아리명 : " +this.getClub());
	}
}
class 조교 extends student{
	public String type;
	public double percentage;
	public void setType(String t) {
		type =t;
	}
	public String getType() {
		return type;
	}
	public 조교(String t,double p) {
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
		System.out.println("조교 유형 : "+this.getType());
		System.out.println("장학금 비율 : "+this.getPercentage());
	}
}
