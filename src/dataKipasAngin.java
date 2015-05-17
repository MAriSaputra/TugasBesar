
public class dataKipasAngin  extends Sarana { 
	

	public void data(){
		System.out.println("== Status Data Kipas Angin ==");
		Insert(); 
		System.out.println("== Review Data Kipas Angin ==");
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
	@Override
	boolean AnalysisKondisi(){
		if(Kondisi.equals("baik")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return false;
	}
	@Override
	boolean AnalysisPosisi(){
		if(Posisi.equals("di_samping_ruangan")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return false;
	}

}
