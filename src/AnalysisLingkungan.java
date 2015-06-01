
public class AnalysisLingkungan extends Lingkungan{
	public void data(){
		Insert(); 
		
		
	}
	@Override
	String AnalysisLantai() {
		if(Lantai.equals("baik")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisDinding() {
		if(Dinding.equals("baik")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisAtap() {
		if(Atap.equals("baik")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisPintu() {
		if(Pintu.equals("baik")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisJendela() {
		if(Jendela.equals("baik")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}
	
	
}