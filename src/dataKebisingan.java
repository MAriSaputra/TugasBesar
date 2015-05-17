
public class dataKebisingan extends Kenyamanan{
	public void data(){
		System.out.println("== Status Data Kebisingan ==");
		Insert(); 
		System.out.println("== Review Data Kebisingan ==");
		Print();
	}
	
	@Override	
	boolean AnalysisKebisingan(){
		if(Kebisingan.equals("tidak bising")){
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}
