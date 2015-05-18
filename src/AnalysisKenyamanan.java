
public class AnalysisKenyamanan extends Kenyamanan {
	public void data(){
		Insert("== Status Data =="); 
		Print("== Review Data ==");
		
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
	
	@Override
	public void Insert(String data){
		
		System.out.println("masukkan kebisingan : ");
		Kebisingan = scan.next();
		System.out.println("masukkan bau : ");
		Bau = scan.next();
		System.out.println("masukkan kebocoran : ");
		Kebocoran = scan.next();
		System.out.println("masukkan kerusakan : ");
		Kerusakan = scan.next();
		System.out.println("masukkan keausan : ");
		Keausan = scan.next();
		
		
	}
	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}
}
