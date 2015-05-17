
public class dataStopKontak extends Sarana {

	public void data(){
		System.out.println("== Status Data Stop Kontak ==");
		Insert();
		System.out.println("== Review Data Stop Kontak ==");
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
	@Override
	boolean AnalysisKondisi(){
		if(Kondisi.equals("baik")){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return false;
	}
	@Override
	boolean AnalysisPosisi(){
		if(Posisi.equals("di_pojok_ruangan")){
			System.out.println("Sesuai");
			return true;
		}
		if(Posisi.equals("di_dekat_dosen")){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
	}
	}
}
