import java.util.Scanner;
abstract public class Kenyamanan implements KenyamananKelas{

		String Kebisingan = "Tidak Bising";
		String Bau = "Tidak Bau";
		String Kebocoran = "Tidak Bocor";
		String Kerusakan = "Tidak Rusak";
		String Keausan = "Tidak Aus";
		
		Scanner scan = new Scanner(System.in);
		
		public void Print(String string){
			
			System.out.println("kebisingan: "+ Kebisingan);
			System.out.println(AnalysisKebisingan());
			System.out.println("bau: "+ Bau);
			System.out.println(AnalysisBau());
			System.out.println("kebocoran: "+ Kebocoran);
			System.out.println(AnalysisKebocoran());
			System.out.println("kerusakan: "+ Kerusakan);
			System.out.println(AnalysisKerusakan());
			System.out.println("keausan: "+ Keausan);
			System.out.println(AnalysisKeausan());
			
		}

		abstract String AnalysisKebisingan();			
		abstract String AnalysisBau();
		abstract String AnalysisKebocoran();	
		abstract String AnalysisKerusakan();
		abstract String AnalysisKeausan();

		public void Insert(String data) {
			// TODO Auto-generated method stub
			
		}
		
		
}
