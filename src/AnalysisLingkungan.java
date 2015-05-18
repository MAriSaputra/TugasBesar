
public class AnalysisLingkungan extends Lingkungan{
	public void data(){
		Insert("== Status Data =="); 
		Print("== Review Data ==");
		
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
	
	@Override
	public void Insert(String lingkungan){
		
		System.out.println("masukkan kondisi lantai: ");
		Lantai = scan.next();
		System.out.println("masukkan kondisi dinding: ");
		Dinding = scan.next();
		System.out.println("masukkan kondisi atap: ");
		Atap = scan.next();
		System.out.println("masukkan kondisi pintu: ");
		Pintu = scan.next();
		System.out.println("masukkan kondisi jendela: ");
		Jendela = scan.next();
		
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
