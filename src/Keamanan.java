import java.util.Scanner;
abstract public class Keamanan {

	String Kekokohan;
	String KunciPintu;
	String KunciJendela;
	String Bahaya;
	
	Scanner scan = new Scanner(System.in);
	
	public void Print(){
		
		System.out.println("Kekokohan : "+ Kekokohan);
		System.out.println(AnalysisKekokohan());
		System.out.println("Kunci Pintu : "+ KunciPintu);
		System.out.println(AnalysisKunciPintu());
		System.out.println("Kunci Jendela : "+ KunciJendela);
		System.out.println(AnalysisKunciJendela());
		System.out.println("Bahaya : "+ Bahaya);
		System.out.println(AnalysisBahaya());
		
	}

	abstract String AnalysisKekokohan(); 
	abstract String AnalysisKunciPintu();
	abstract String AnalysisKunciJendela();
	abstract String AnalysisBahaya();

	public void Insert(String data) {
		// TODO Auto-generated method stub
		
	}

	
		
}
