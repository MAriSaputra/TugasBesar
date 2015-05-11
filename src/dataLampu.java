
public class dataLampu extends Inheritance { 
	

	public void data(){
		System.out.println("Status data Lampu :");
		Insert(); 
		System.out.println("Review data Lampu :");
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
		if(Posisi.equals("di atap ruangan")){
			System.out.println("Sesuai");
		}
		
		else{
			System.out.println("Tidak Sesuai");
		}
		return Posisi;
	}

}
