import java.util.Scanner;
abstract public class Kebersihan implements KebersihanKelas{
	String SirkulasiUdara = "Lancar";
	int NilaiPencahayaan;
	int Kelembapan;
	int Suhu;

	Scanner scan = new Scanner(System.in);
	
	public void Print(String kebersihan){
			
		System.out.println("Sirkulasi Udara : "+ SirkulasiUdara);
		System.out.println("Nilai Pencahayaan : "+ NilaiPencahayaan);
		System.out.println("Nilai Kelembapan : "+ Kelembapan);
		System.out.println("Nilai Suhu : "+ Suhu);
}

	abstract String AnalysisSirkulasiUdara();
	abstract String AnalysisNilaiPencahayaan();
	abstract String AnalysisKelembapan();
	abstract String AnalysisSuhu();

	public void Insert(String data) {
		// TODO Auto-generated method stub
		
	}
		
}