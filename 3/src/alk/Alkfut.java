package alk;

public class Alkfut {

	public static void main(String[] args) {
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setPayment(10);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setPayment(15);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setPayment(29);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setPayment(70);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setPayment(67);
		
		for(Alkalmazott a : alkok)
			System.out.println(a.szovegVissza());
		
		int max = alkok[0].getPayment();
		for(int i=0; i<alkok.length; i++){
			if(alkok[i].getPayment() > max)
				max = alkok[i].getPayment();
		}
		System.out.println("A legnagyobb fizetésû alkalmazott: " + max);
		
		for(int i=0; i<alkok.length; i++){
			if(alkok[i].getPayment() == max);
				System.out.println(alkok[i].szovegVissza());
		}
		
		/*int db = 0;
		for(int i=0; i<alkok.length; i++){
			if(alkok[i].)*/
		
		
	}
}
