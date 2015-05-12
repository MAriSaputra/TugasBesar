
public class dataStopKontak extends Sarana {

	public void data(){
		System.out.println("Status Stop Kontak :");
		Insert();
		System.out.println("Review Stop Kontak :");
		Print();
		
	}
	
	@Override
	boolean AnalysisJumlah(){
		if(Jumlah == 4){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}
	
	String AnalysisKondisi(){
		if(Kondisi.equals("baik")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return Kondisi;
	}
	
	String AnalysisPosisi(){
		if(Posisi.equals("di pojok ruangan")){
			System.out.println("Sesuai");
		}
		if(Posisi.equals("di dekat dosen")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return Posisi;
	}

}
