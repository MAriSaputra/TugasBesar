
public class data_AC extends Sarana { 
	

	public void data(){
		System.out.println("Status data AC :");
		Insert(); 
		System.out.println("Review data AC :");
		Print();
	}
	
	@Override	
	boolean AnalysisJumlah(){
		if(Jumlah == 1){
			System.out.println("sesuai");
			return true;
		}
		
		else{
			System.out.println("tidak sesuai");
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
		if(Posisi.equals("di samping ruangan")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return Posisi;
	}


}
