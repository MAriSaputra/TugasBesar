
public class data_CCTV extends Inheritance { 
	

	public void data(){
		System.out.println("Status data CCTV :");
		Insert(); 
		System.out.println("Review data CCTV :");
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
		if(Kondisi.equals("Baik")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return Kondisi;
	}
	
	String AnalysisPosisi(){
		if(Posisi.equals("di Depan")){
			System.out.println("Sesuai");
		}
		if(Posisi.equals("di Belakang")){
			System.out.println("Sesuai");
		}
		else{
			System.out.println("Tidak Sesuai");
		}
		return Posisi;
	}

}
