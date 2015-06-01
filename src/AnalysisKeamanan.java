
public class AnalysisKeamanan extends Keamanan {
	public void data(){
		Insert(); 
	
		
	}
	
	@Override
	String AnalysisKekokohan() {
			  if(Kekokohan.equals("kokoh")){
				  return "Sudah Sesuai Standard ";
		      }
			  else {
		        
		          return "Belum Sesuai Standard";
		      }
	}

	@Override
	String AnalysisKunciPintu() {
		if(KunciPintu.equals("ada")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}
	@Override
	String AnalysisKunciJendela() {
		if(KunciJendela.equals("ada")){
		   	  
		   	   return "Sudah Sesuai Standard ";
		      }
			  else {
		        
		          return "Belum Sesuai Standard";
		      }
	}

	@Override
	String AnalysisBahaya() {
		 if(Bahaya.equals("tidakada")){
			 return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	
}
