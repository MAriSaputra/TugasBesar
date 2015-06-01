import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
abstract public class Kebersihan implements Kelas{
	String SirkulasiUdara = "Lancar";
	int NilaiPencahayaan;
	int Kelembapan;
	int Suhu;

	Scanner scan = new Scanner(System.in);

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
		
