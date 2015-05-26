import java.util.Scanner;
import java.io.*;
abstract public class Keamanan implements KeamananKelas {

	String Kekokohan;
	String KunciPintu;
	String KunciJendela;
	String Bahaya;
	
	Scanner scan = new Scanner(System.in);
	
	
	public void Print(){
		try{
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
			out.println("Kekokohan : "+ Kekokohan);
			out.println(AnalysisKekokohan());
			out.println("Kunci Pintu : "+ KunciPintu);
			out.println(AnalysisKunciPintu());
			out.println("Kunci Jendela : "+ KunciJendela);
			out.println(AnalysisKunciJendela());
			out.println("Bahaya : "+ Bahaya);
			out.println(AnalysisBahaya());
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}

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


		

