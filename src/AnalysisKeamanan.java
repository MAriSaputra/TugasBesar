
public class AnalysisKeamanan extends Keamanan {
	public void data(){
		Insert(); 
		Print();
		
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
		 if(Bahaya.equals("tidak_ada")){
			 return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	
}
