package kivetel;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class Test {
	public static void main(String[] args){
	int[] array = new int[5];
	
	try{
		readNexIn(array);
	} catch (PrimeException e){
		e.printStackTrace();
	}
	readNextLine(array);
	//readBRintValue(array);
	writeElements(array);

	}
	public static void writeElements(int[] arrayIn){
		for(int i=0; i<arrayIn.length; i++)
			System.out.println("A tömb " + (i+1) + ". elemét: " + arrayIn);
	}
	public static void readNexIn(int[] arrayIn) throws PrimeException{
		Scanner sc = new Scanner(System.in);
		int number = 0;
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			number = sc.nextInt();
			
			if(isPrime(number)){
				arrayIn[i] = number;
			} else {
				throw new PrimeException("Nem prímszám!");
				
			}
			
			
		}
		sc.close();
	}
	
	public static void readNextLine(int[] arrayIn){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			String line = sc.nextLine();
			arrayIn[i] = Integer.parseInt(line);
		}
		sc.close();
	}
	public static void readBRintValue(int[] arrayIn){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			String line = "";
			
			try{
				line = br.readLine();
			}catch (IOException e){
				e.printStackTrace();
			}
			
			arrayIn[i] = Integer.valueOf(line).intValue();
		}
		
	}
	public static void readBRreadLine(int[] arrayIn){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			String line = "";
			
			try{
				line = br.readLine();
			}catch (IOException e){
				e.printStackTrace();
			}
			
			arrayIn[i] = Integer.parseInt(line);
		}
		
	}
	
	public static boolean isPrime(int number){
		if(number < 2)
			return false;
		
		for(int i=2; i<number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
}