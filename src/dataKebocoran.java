
public class dataKebocoran extends Kenyamanan{
	public void data(){
		System.out.println("== Status Data Kebocoran ==");
		Insert(); 
		System.out.println("== Review Data Kebocoran ==");
		Print();
	}
	
	@Override	
	boolean AnalysisKebocoran(){
		if(Kebocoran.equals("tidak bocor")){
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}
