package tehlalap;

import java.util.Scanner;

public class teglalapfut2 {

	public static void main(String[] args) {
		teglalap rectangles[] = new teglalap[10];

		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new teglalap((int) (Math.random() * 9) + 2, (int) (Math.random() * 9) + 2);
			System.out.println(rectangles[i].getAdatok());
		}

		int mini = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].getTerulet() < rectangles[mini].getTerulet())
				mini = 1;
		}
		System.out.println("A legkisebb ter�let� t�glalap adatai: " + rectangles[mini].getAdatok());

		Scanner sc = new Scanner(System.in);
		System.out.println("K�rem a t�glalap A oldal�t: ");
		int newA = sc.nextInt();
		System.out.println("K�rem a t�glalap B oldal�t: ");
		int newB = sc.nextInt();

		teglalap newRectangles = new teglalap(newA, newB);

		int db = 0;
		for (teglalap t : rectangles) {
			if (t.getTerulet() < newRectangles.getTerulet())
				db++;
		}
		System.out.println("A megadott �j t�glalapt�l kisebb ter�let� t�glalapok sz�ma: " + db);

		System.out.println("");

		boolean isTrue = false;
		int index = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].getOldalakEgyeznekE(newRectangles)) {
				isTrue = true;
				index = i;
				break;
			}
		}
		if (isTrue)
			System.out.println("Az egyez� oldal� t�glalap objektum indexe: " + index);
		else
			System.out.println("Nem volt egyez� m�ret� t�glalap");
	}

}
