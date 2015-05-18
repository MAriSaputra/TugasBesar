import java.util.Scanner;
abstract public class Sarana implements SaranaKelas{
	
	int Jumlah;
	String Kondisi;
	String Posisi;
	
	Scanner scan = new Scanner(System.in);
	
	public void Insert(String sarana){
		
		System.out.println("masukkan Jumlah : ");
		Jumlah= scan.nextInt();
		System.out.println("masukkan Kondisi : ");
		Kondisi = scan.next();
		System.out.println("masukkan Posisi : ");
		Posisi = scan.next();
	}
	
	public void Print(String sarana){
		
		System.out.println("Jumlah : "+ Jumlah);
		System.out.println("Kondisi : "+ Kondisi);
		System.out.println("Posisi : "+ Posisi);
		
	}

	abstract boolean AnalysisJumlahStopKontak();
	abstract String AnalysisKondisiStopKontak();
	abstract String AnalysisPosisiStopKontak();
	abstract boolean AnalysisJumlahKabel_LCD();
	abstract String AnalysisKondisiKabel_LCD();
	abstract String AnalysisPosisiKabel_LCD();
	abstract boolean AnalysisJumlahLampu();
	abstract String AnalysisKondisiLampu();
	abstract String AnalysisPosisiLampu();
	abstract boolean AnalysisJumlahKipasAngin();
	abstract String AnalysisKondisiKipasAngin();
	abstract String AnalysisPosisiKipasAngin();
	abstract boolean AnalysisJumlah_AC();
	abstract String AnalysisKondisi_AC();
	abstract String AnalysisPosisi_AC();
	abstract boolean AnalysisJumlah_CCTV();
	abstract String AnalysisKondisi_CCTV();
	abstract String AnalysisPosisi_CCTV();

	

	String AnalysisPosisi() {
		// TODO Auto-generated method stub
		return null;
	}

	String AnalysisKondisi() {
		// TODO Auto-generated method stub
		return null;
	}
	}

