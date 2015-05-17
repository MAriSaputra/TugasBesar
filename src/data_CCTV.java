
public class data_CCTV extends Sarana { 
	

	public void data(){
		System.out.println("== Status Data CCTV ==");
		Insert(); 
		System.out.println("== Review Data CCTV ==");
		Print();
	}
	
	@Override
	boolean AnalysisJumlah(){
		if(Jumlah == 2){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}
	
	boolean AnalysisKondisi(){
		if(Kondisi.equals("baik")){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}
	
	boolean AnalysisPosisi(){
		if(Posisi.equals("di_depan")){
			System.out.println("Sesuai");
			return true;
		}
		if(Posisi.equals("di_belakang")){
			System.out.println("Sesuai");
			return true;
		}
		else{
			System.out.println("Tidak Sesuai");
		return false;
		}
	}

}
