import java.util.Scanner;
public class Lingkungan {
	String Kondisi;

	
	Scanner scan = new Scanner(System.in);
	
public void Insert(){
		
		System.out.println("masukkan kondisi : ");
		Kondisi = scan.next();
		
		
	}
	
	public void Print(){
		
		System.out.println("kondisi : "+ Kondisi);
		
	}

	boolean AnalysisLantai() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisDinding() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisAtap() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisPintu() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean AnalysisJendela() {
		// TODO Auto-generated method stub
		return false;
	}

}
