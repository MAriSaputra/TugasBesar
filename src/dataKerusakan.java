
public class dataKerusakan extends Kenyamanan{
	public void data(){
		System.out.println("== Status Data Kerusakan ==");
		Insert(); 
		System.out.println("== Review Data Kerusakan ==");
		Print();
	}
	
	@Override	
	boolean AnalysisKerusakan(){
		if(Kebocoran.equals("tidak rusak")){
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}
