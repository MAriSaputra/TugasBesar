
public class data_AC extends Sarana { 
	

	public void data(){
		System.out.println("== Status Data AC ==");
		Insert(); 
		System.out.println("== Review Data AC ==");
		Print();
	}
	
	@Override	
	boolean AnalysisJumlah(){
		if(Jumlah == 1){
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
			return false;
		}
		
	}
	
	@Override
	boolean AnalysisPosisi(){
		if(Posisi.equals("di_samping_ruangan")){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
		
	}


}
