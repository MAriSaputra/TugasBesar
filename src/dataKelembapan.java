
public class dataKelembapan extends Kebersihan{
	public void data(){
		System.out.println("== Status Data Nilai Kelembapan ==");
		Insert(); 
		System.out.println("== Review Data Nilai Kelembapan ==");
		Print();
	}
	
	@Override	
	boolean AnalysisKelembapan(){
		if(Kelembapan<=80 && Kelembapan>=70){
	         
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}
