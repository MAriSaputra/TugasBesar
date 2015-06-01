import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
abstract public class Kenyamanan implements Kelas{

		String Kebisingan = "Tidak Bising";
		String Bau = "Tidak Bau";
		String Kebocoran = "Tidak Bocor";
		String Kerusakan = "Tidak Rusak";
		String Keausan = "Tidak Aus";
		
		Scanner scan = new Scanner(System.in);
			
		@Override
		public void Insert(){
			
			System.out.println("masukkan kebisingan : ");
			Kebisingan = scan.next();
			System.out.println("masukkan bau : ");
			Bau = scan.next();
			System.out.println("masukkan kebocoran : ");
			Kebocoran = scan.next();
			System.out.println("masukkan kerusakan : ");
			Kerusakan = scan.next();
			System.out.println("masukkan keausan : ");
			Keausan = scan.next();
			
			
		}

		abstract String AnalysisKebisingan();			
		abstract String AnalysisBau();
		abstract String AnalysisKebocoran();	
		abstract String AnalysisKerusakan();
		abstract String AnalysisKeausan();

		
			
			
		}
			
		
		
		

