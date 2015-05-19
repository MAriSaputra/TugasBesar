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
		
		System.out.println("kondisi lantai: "+ Lantai);
		System.out.println(AnalysisLantai());
		System.out.println("kondisi dinding: "+ Dinding);
		System.out.println(AnalysisDinding());
		System.out.println("kondisi atap: "+ Atap);
		System.out.println(AnalysisAtap());
		System.out.println("kondisi pintu: "+ Pintu);
		System.out.println(AnalysisPintu());
		System.out.println("kondisi jendela: "+ Jendela);
		System.out.println(AnalysisJendela());
		
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


	
		


