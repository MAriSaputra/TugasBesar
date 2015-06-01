
public class AnalysisKebersihan extends Kebersihan{
	public void data(){
		Insert(); 
		
	}
	@Override
	String AnalysisSirkulasiUdara() {
		if(SirkulasiUdara.equals("lancar")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisNilaiPencahayaan() {
		if(NilaiPencahayaan<=300 && NilaiPencahayaan>=250){  
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}
	

	@Override
	String AnalysisKelembapan() {
		if(Kelembapan<=80 && Kelembapan>=70){   
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}

	@Override
	String AnalysisSuhu() {
		if(Suhu<=30 && Suhu>=25){
	         
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}
	
	
	

}
