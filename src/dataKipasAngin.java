
public class dataKipasAngin  extends Sarana { 
	

	public void data(){
		System.out.println("Status data Kipas Angin :");
		Insert(); 
		System.out.println("Review data Kipas Angin :");
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
