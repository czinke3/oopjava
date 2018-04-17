package bwe;
import bwe.BookWithEnum.style;

public class Test {

	public static void main(String[] args) {
		
	}
	public static void bookDataWrite(Book[] bookArray) {
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
