package myproductsRun;

//import myproducts.Product;
//import myproducts.Bread;
import myproducts.*;

public class ProductsRun {

	public static void main(String[] args) {
		Product p1 = new Product("Product1", 100, 27);
		Bread b1 = new Bread("Bread1", 200, 27, 2);
		
		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());
	}

}
