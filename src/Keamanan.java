import java.util.Scanner;
public class Keamanan {

	String Kekokohan;
	String KunciPintu;
	String KunciJendela;
	String Bahaya;
	
	Scanner scan = new Scanner(System.in);
	
	public void Insert(){
		
		System.out.println("masukkan Kekokohan : ");
		Kekokohan = scan.next();
		
		System.out.println("masukkan Kunci Pintu : ");
		KunciPintu= scan.next();
		
		System.out.println("masukkan Kunci Jendela : ");
		KunciJendela = scan.next();
		
		System.out.println("masukkan Bahaya : ");
		Bahaya = scan.next();
	}
	
	public void Print(){
		
		System.out.println("Kekokohan : "+ Kekokohan);
		System.out.println("Kunci Pintu : "+ KunciPintu);
		System.out.println("Kunci Jendela : "+ KunciJendela);
		System.out.println("Bahaya : "+ Bahaya);
	}

	boolean AnalysisKekokohan() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisKunciPintu() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisKunciJendela() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisBahaya() {
		// TODO Auto-generated method stub
		return false;
	}
}
