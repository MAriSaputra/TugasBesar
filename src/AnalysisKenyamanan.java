
public class AnalysisKenyamanan extends Kenyamanan {
	public void data(){
		Insert(); 
		Print();
		
	}
	@Override
	String AnalysisKebisingan() {
		if(Kebisingan.equals("tidak_bising")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisBau() {
		if(Bau.equals("tidak_bau")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}

	@Override
	String AnalysisKebocoran() {
		if(Kebocoran.equals("tidak_bocor")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}
	

	@Override
	String AnalysisKerusakan() {
		if(Kerusakan.equals("tidak_rusak")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}	

	@Override
	String AnalysisKeausan() {
		if(Keausan.equals("tidak_aus")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}
	
	
	
}
