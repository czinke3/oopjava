package x;

public class teglalapfut2 {

	public static void main(String[] args) {
		teglalap rectangles[] = new teglalap[10];
		
		for(int i=0; i<rectangles.length; i++) {
			rectangles[i] = new teglalap((int)(Math.random()*8) + 1, (int)(Math.random()*8) + 1);
			System.out.println(rectangles[i].getAdatok());
		}

	}

}
