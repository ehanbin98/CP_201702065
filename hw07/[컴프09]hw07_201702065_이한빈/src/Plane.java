
public class Plane {
 private String Company;
 private String model;
 private int member;
 public static int planes=0;
 int pl;
 public Plane(String c,String m, int me) {
	 Company = c;
	 model = m;
	 member = me;
	 pl = ++planes;
 }
 public Plane(String c, int me) {
	 Company = c;
	 model = "SAM-572";
	 member = me;
	 pl = ++planes;
 }

 public static int getPlanes() {
	 return planes;
 }
 public void print() {
	 System.out.println("Á¦Á¶»ç : "+this.Company+" ¸ðµ¨ : "+this.model+" ½Â°´ ¼ö : "+this.member);
 }
}
