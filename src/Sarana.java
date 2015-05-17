import java.util.Scanner;
public class Sarana {
	int Jumlah;
	String Kondisi;
	String Posisi;
	
	Scanner scan = new Scanner(System.in);
	
	public void Insert(){
		
		System.out.println("masukkan Jumlah : ");
		Jumlah = scan.nextInt();
		
		System.out.println("masukkan Kondisi : ");
		Kondisi= scan.next();
		
		System.out.println("masukkan Posisi : ");
		Posisi = scan.next();
	}
	
	public void Print(){
		
		System.out.println("Jumlah : "+ Jumlah);
		System.out.println("Kondisi : "+ Kondisi);
		System.out.println("Posisi : "+ Posisi);
	}

	boolean AnalysisJumlah() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisKondisi() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisPosisi() {
		// TODO Auto-generated method stub
		return false;
	}
}
