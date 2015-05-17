
public class dataSuhu extends Kebersihan{
	public void data(){
		System.out.println("== Status Data Nilai Suhu ==");
		Insert(); 
		System.out.println("== Review Data Nilai Suhu ==");
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
