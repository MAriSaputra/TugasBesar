
public class dataLantai extends Lingkungan{
	public void data(){
		System.out.println("== Status Data Lantai ==");
		Insert(); 
		System.out.println("== Review Data Lantai ==");
		Print();
	}
	@Override
	  boolean AnalysisLantai(){
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