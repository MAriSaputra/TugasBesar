
public class dataNilaiPencahayaan extends Kebersihan{
	public void data(){
		System.out.println("== Status Data Nilai Pencahayaan ==");
		Insert(); 
		System.out.println("== Review Data Nilai Pencahayaan ==");
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

