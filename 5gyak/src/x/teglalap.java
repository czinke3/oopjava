package x;

public class teglalap {
	private int a;
	private int b;
	
	public teglalap(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}
	
	public teglalap(int sideIn){
		a = sideIn;
		b = sideIn;
	}
	
	public int getTerulet() {
		return a * b;
	}
	
	public String getAdatok() {
		return "A oldal: " + a + " B oldal: " + b + " Terület: " + getTerulet();
	}
	
	public void setOldal(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}
	
	public void setOldal(int sideIn) {
		a = sideIn;
		b = sideIn;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public boolean getTeruletMasik(teglalap other) {
		if(getTerulet() > other.getTerulet())
			return true;
		
		return false;
	}
	
	public boolean getOldalakEgyeznekE(teglalap other) {
		if(a == other.a && b == other.b)
			return true;
		
		return false;
	}
}
