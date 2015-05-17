
public class dataPintu extends Lingkungan {
	public void data(){
		System.out.println("== Status Data Pintu ==");
		Insert(); 
		System.out.println("== Review Data Pintu ==");
		Print();
	}
	
	@Override
	  boolean AnalysisPintu(){
	  if(Kondisi.equals("baik")){
   	   System.out.println("Sudah Sesuai Standard ");
   	   return true;
      }
	  else {
          System.out.println("Belum Sesuai Standard");
          return false;
      }
}
}
