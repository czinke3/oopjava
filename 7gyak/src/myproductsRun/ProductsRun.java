package myproductsRun;

//import myproducts.Product;
//import myproducts.Bread;
import myproducts.*;

public class ProductsRun {

	public static void main(String[] args) {
		Product p1 = new Product("Product1", 100, 50);
		Bread b1 = new Bread("Bread1", 200, 27, 2);
		
		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());
		
		System.out.println("");
		
		int priceCompare = p1.productCompare(b1);
		if(priceCompare == 1)
			System.out.println("A p1 ára a nagyobb.");
		else if(priceCompare == -1)
			System.out.println("A b1 ára a nagyobb");
		else
			System.out.println("A p1 és p2 ára ugyanannyi");
		
		System.out.println("");
		
		Bread b2 = new Bread("Bread2", 150, 24, 3);
		Product product2 = b2;
		System.out.println("A product2 adatai: " + product2.toString());
		
		
		System.out.println("");
		
		Bread bread2 = new Bread("bread2" , 200, 20, 3);
		
		boolean res = Bread.BreadPriceCompare((Bread) product2, bread2);
		if(res)
			System.out.println("A product2 ára a nagyobb");
		else
			System.out.println("A bread2 ára a nagyobb");
	}
	

}
