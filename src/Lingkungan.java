import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
abstract public class Lingkungan implements Kelas{
	
	String Lantai;
	String Dinding;
	String Atap;
	String Pintu;
	String Jendela;

	Scanner scan = new Scanner(System.in);
	
	abstract String AnalysisLantai();
	abstract String AnalysisDinding();
	abstract String AnalysisAtap();
	abstract String AnalysisPintu();
	abstract String AnalysisJendela();

	
		@Override
		public void Insert(){
			
			System.out.println("masukkan kondisi lantai: ");
			Lantai = scan.next();
			System.out.println("masukkan kondisi dinding: ");
			Dinding = scan.next();
			System.out.println("masukkan kondisi atap: ");
			Atap = scan.next();
			System.out.println("masukkan kondisi pintu: ");
			Pintu = scan.next();
			System.out.println("masukkan kondisi jendela: ");
			Jendela = scan.next();
			
		}
		
	}


	
		


