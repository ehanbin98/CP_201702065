
public class Dog {
	private String name;
	static String breed="¸Ø¹³¹Ì";
	private int age;

	
	public Dog(String n,int a) {
		setDog(n,breed,a);
	}
	public Dog (String n,String b,int a) {
		setDog(n,b,a);
	}

	public void setDog(String n, String b,int a) {
		this.name = n;
		this.breed = b;
		this.age = a;
	}

	public void print() {
		System.out.println("ÀÌ¸§: "+this.name+" Á¾·ù: "+this.breed+" ³ªÀÌ: "+this.age);
	}
}
