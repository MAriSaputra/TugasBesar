
public class dataKelembapan extends Kebersihan{
	public void data(){
		System.out.println("Status data nilai kelembapan :");
		Insert(); 
		System.out.println("Review daata nilai kelembapan :");
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
