import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
abstract public class Lingkungan implements LingkunganKelas{
	
	String Lantai;
	String Dinding;
	String Atap;
	String Pintu;
	String Jendela;

	Scanner scan = new Scanner(System.in);
	
	@Override
	public void Print(){
		try{
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
			out.println("kondisi lantai: "+ Lantai);
			out.println(AnalysisLantai());
			out.println("kondisi dinding: "+ Dinding);
			out.println(AnalysisDinding());
			out.println("kondisi atap: "+ Atap);
			out.println(AnalysisAtap());
			out.println("kondisi pintu: "+ Pintu);
			out.println(AnalysisPintu());
			out.println("kondisi jendela: "+ Jendela);
			out.println(AnalysisJendela());
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		
	}

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


	
		


