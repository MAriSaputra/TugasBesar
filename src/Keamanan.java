import java.util.Scanner;

import java.io.*;
abstract public class Keamanan implements Kelas {

	String Kekokohan;
	String KunciPintu;
	String KunciJendela;
	String Bahaya;
	
	Scanner scan = new Scanner(System.in);

	abstract String AnalysisKekokohan(); 
	abstract String AnalysisKunciPintu();
	abstract String AnalysisKunciJendela();
	abstract String AnalysisBahaya();
	
	@Override
	public void Insert() {
		
			System.out.println("masukkan Kekokohan : ");
			Kekokohan = scan.next();
			
			System.out.println("masukkan Kunci Pintu : ");
			KunciPintu= scan.next();
			
			System.out.println("masukkan Kunci Jendela : ");
			KunciJendela = scan.next();
			
			System.out.println("masukkan Bahaya : ");
			Bahaya = scan.next();
			
		}
		
	}


		

