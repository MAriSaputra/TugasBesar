
public class dataNilaiPencahayaan extends Kebersihan{
	public void data(){
		System.out.println("Status data nilai pencahayaan :");
		Insert(); 
		System.out.println("Review daata nilai pencahayaan :");
		Print();
	}
	
	@Override	
	boolean AnalysisNilaiPencahayaan(){
		if(NilaiPencahayaan<=350 && NilaiPencahayaan>=250){
	         
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
}

