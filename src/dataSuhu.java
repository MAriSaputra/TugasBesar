
public class dataSuhu extends Kebersihan{
	public void data(){
		System.out.println("Status data nilai suhu :");
		Insert(); 
		System.out.println("Review daata nilai suhu :");
		Print();
	}
	
	@Override	
	boolean AnalysisSuhu(){
		if(Suhu<=35 && Suhu>=25){
	         
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}
