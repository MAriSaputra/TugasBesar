import java.util.Scanner;
public class Kenyamanan {

		String Kebisingan = "Tidak Bising";
		String Bau = "Tidak Bau";
		String Kebocoran = "Tidak Bocor";
		String Kerusakan = "Tidak Rusak";
		String Keausan = "Tidak Aus";
		
		Scanner scan = new Scanner(System.in);
		
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
		
		public void Print(){
			
			System.out.println("kebisingan: "+ Kebisingan);
			System.out.println("bau: "+ Bau);
			System.out.println("kebocoran: "+ Kebocoran);
			System.out.println("kerusakan: "+ Kerusakan);
			System.out.println("keausan: "+ Keausan);
			
		}

		boolean AnalysisKebisingan() {
			// TODO Auto-generated method stub
			return false;
		}

		boolean AnalysisBau() {
			// TODO Auto-generated method stub
			return false;
		}

		boolean AnalysisKebocoran() {
			// TODO Auto-generated method stub
			return false;
		}

		boolean AnalysisKerusakan() {
			// TODO Auto-generated method stub
			return false;
		}

		boolean AnalysisKeausan() {
			// TODO Auto-generated method stub
			return false;
		}
}
