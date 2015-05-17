
public class dataKeausan extends Kenyamanan{
	public void data(){
		System.out.println("== Status Data Keausan ==");
		Insert(); 
		System.out.println("== Review Data Keausan ==");
		Print();
	}
	
	@Override	
	boolean AnalysisKeausan(){
		if(Kebocoran.equals("tidak aus")){
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}
