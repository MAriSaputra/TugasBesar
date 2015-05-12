
public class dataKebisingan extends Kenyamanan{
	public void data(){
		System.out.println("Status data kebisingan :");
		Insert(); 
		System.out.println("Review data kebisingan :");
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
