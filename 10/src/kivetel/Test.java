package kivetel;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class Test {
	public static void main(String[] args){
	int[] array = new int[5];
	
	readNextLine(array);	
	writeElements(array);

	}
	public static void writeElements(int[] arrayIn){
		for(int i=0; i<arrayIn.length; i++)
			System.out.println("A t�mb " + (i+1) + ". elem�t: " + arrayIn);
	}
	public static void readNexIn(int[] arrayIn){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("K�rem a t�mb " + i + ". elem�t: ");
			arrayIn[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static void readNextLine(int[] arrayIn){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("K�rem a t�mb " + i + ". elem�t: ");
			String line = sc.nextLine();
			arrayIn[i] = Integer.parseInt(line);
		}
		sc.close();
	}
	public static void readBRintValue(int[] arrayIn){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<arrayIn.length; i++){			
			System.out.println("K�rem a t�mb " + i + ". elem�t: ");
			String line = "";
			
			try{
				line = br.readLine();
			}catch (IOException e){
				e.printStackTrace();
			}
			
			arrayIn[i] = Integer.valueOf(line).intValue();
		}
		
	}
	
	
}