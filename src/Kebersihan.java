import java.util.Scanner;
abstract public class Kebersihan implements KebersihanKelas{
	String SirkulasiUdara = "Lancar";
	int NilaiPencahayaan;
	int Kelembapan;
	int Suhu;

	Scanner scan = new Scanner(System.in);
	@Override
	public void Print() {
		System.out.println("Sirkulasi Udara : "+ SirkulasiUdara);
		System.out.println(AnalysisSirkulasiUdara());
		System.out.println("Nilai Pencahayaan : "+ NilaiPencahayaan);
		System.out.println(AnalysisNilaiPencahayaan());
		System.out.println("Nilai Kelembapan : "+ Kelembapan);
		System.out.println(AnalysisKelembapan());
		System.out.println("Nilai Suhu : "+ Suhu);
		System.out.println(AnalysisSuhu());
		
	}

	abstract String AnalysisSirkulasiUdara();
	abstract String AnalysisNilaiPencahayaan();
	abstract String AnalysisKelembapan();
	abstract String AnalysisSuhu();

	
		@Override
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
		
	}
		
