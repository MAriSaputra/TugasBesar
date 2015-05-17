
public class dataKunciPintu extends Keamanan{
	public void data(){
		System.out.println("== Status Data Kunci Pintu ==");
		Insert(); 
		System.out.println("== Review Data Kunci Pintu ==");
		Print();
	}
	
	@Override
	  boolean AnalysisKunciPintu(){
	  if(KunciPintu.equals("sesuai")){
   	   System.out.println("Sudah Sesuai Standard ");
   	   return true;
      }
	  else {
          System.out.println("Belum Sesuai Standard");
          return false;
      }
}
}
