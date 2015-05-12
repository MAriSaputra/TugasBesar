import java.util.Scanner;
public class Kebersihan {
	String SirkulasiUdara = "Lancar";
	int NilaiPencahayaan;
	int Kelembapan;
	int Suhu;

	Scanner scan = new Scanner(System.in);
	
	public void Insert(){
		
		System.out.println("masukkan sirkulasi udara : ");
		SirkulasiUdara = scan.next();
		System.out.println("masukkan nilai pencahayaan : ");
		NilaiPencahayaan = scan.nextInt();
		System.out.println("masukkan nilai kelembapan : ");
		Kelembapan = scan.nextInt();
		System.out.println("masukkan nilai suhu : ");
		Suhu = scan.nextInt();
	}
	
	public void Print(){
			
		System.out.println("Sirkulasi Udara : "+ SirkulasiUdara);
		System.out.println("Nilai Pencahayaan : "+ NilaiPencahayaan);
		System.out.println("Nilai Kelembapan : "+ Kelembapan);
		System.out.println("Nilai Suhu : "+ Suhu);
}

	boolean AnalysisSirkulasiUdara() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisNilaiPencahayaan() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisKelembapan() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisSuhu() {
		// TODO Auto-generated method stub
		return false;
	}
}