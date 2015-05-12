
public class dataKerusakan extends Kenyamanan{
	public void data(){
		System.out.println("Status data kerusakan :");
		Insert(); 
		System.out.println("Review data kerusakan :");
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
