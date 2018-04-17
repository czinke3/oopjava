package bwe;
import java.util.Scanner;

import bwe.BookWithEnum.style;

public class Test {

	public static void main(String[] args) {
		BookWithEnum[] bweArray;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("K�rem az adatok sz�m�t: ");
		int length = sc.nextInt();
		
		bweArray = new BookWithEnum[length];
		
		for(int i=0; i< bweArray.length; i++){
		System.out.println("K�rem a c�met: ");
		String title = sc.next();
		
		System.out.println("K�rem a szerz�t: ");
		String author = sc.next();
		
		System.out.println("K�rem a kiad�si �vet: ");
		int dateOfissue = sc.nextInt();
		
		System.out.println("K�rem a �r�t: ");
		int price = sc.nextInt();
		
		System.out.println("K�rem a st�lust: ");
		String styleString = sc.next();
		style bookStyle = style.ROMANCE;
		
		if(styleString.contains("romance"))
			bookStyle = style.ROMANCE;
		
		if(styleString.contains("scifi"))
			bookStyle = style.SCIFI;
		
		if(styleString.contains("other"))
			bookStyle = style.OTHER;
		
		if(styleString.contains("cook"))
			bookStyle = style.COOK;
		
		bweArray[i] = new BookWithEnum(title, author, dateOfissue, price, bookStyle);
	}
		bookDataWrite(bweArray);
		BookWithEnum[] bweArray2 = getBWE(bweArray, style.SCIFI);
	}
	public static void bookDataWrite(BookWithEnum[] bookArray) {
		System.out.println("");
		for(Book b : bookArray)
			System.out.println(b.toString());
	}
	
	public static BookWithEnum[] getBWE(BookWithEnum[] bweArray, style bookStyle) {
		BookWithEnum[] bweTemp = new BookWithEnum[bweArray.length];
		
		for (int i = 0; i < bweArray.length; i++){
			if(bweArray[i].getBookStyle() == bookStyle){
				bweTemp[i] = bweArray[i];
			}
		}
		return bweTemp;
	}

}
