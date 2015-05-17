
public class dataKekokohan extends Keamanan {
	public void data(){
		System.out.println("== Status Data Kekokohan ==");
		Insert(); 
		System.out.println("== Review Data Kekokohan ==");
		Print();
	}
	
	@Override
	  boolean AnalysisKekokohan(){
	  if(Kekokohan.equals("kokoh")){
   	   System.out.println("Sudah Sesuai Standard ");
   	   return true;
      }
	  else {
          System.out.println("Belum Sesuai Standard");
          return false;
      }
}
}
