
public class dataSirkulasiUdara extends Kebersihan{
	public void data(){
		System.out.println("== Status Data Sirkulasi Udara ==");
		Insert(); 
		System.out.println("== Review Data Sirkulasi Udara ==");
		Print();
	}
	
	@Override	
	boolean AnalysisSirkulasiUdara(){
		if(SirkulasiUdara.equals("lancar")){
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}
	


}
