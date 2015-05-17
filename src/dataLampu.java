
public class dataLampu extends Sarana { 
	

	public void data(){
		System.out.println("== Status Data Lampu ==");
		Insert(); 
		System.out.println("== Review Data Lampu ==");
		Print();
	}
	
	@Override
	boolean AnalysisJumlah(){
		if(Jumlah == 18){
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
		if(Posisi.equals("di_atap_ruangan")){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return false;
	}

}
