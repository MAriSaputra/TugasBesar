
public class AnalysisKeamanan extends Keamanan implements KeamananKelas{
	public void data(){
		Insert("== Status Data =="); 
		Print("== Review Data ==");
		
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

	@Override
	public void Insert(String data) {
		System.out.println("masukkan Kekokohan : ");
		Kekokohan = scan.next();
		
		System.out.println("masukkan Kunci Pintu : ");
		KunciPintu= scan.next();
		
		System.out.println("masukkan Kunci Jendela : ");
		KunciJendela = scan.next();
		
		System.out.println("masukkan Bahaya : ");
		Bahaya = scan.next();
		
	}

	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}
	public void Print(String keamanan) {
		// TODO Auto-generated method stub
		
	}
}
