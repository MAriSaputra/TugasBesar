
public class dataLantai extends Lingkungan{
	public void data(){
		System.out.println("Status data lantai :");
		Insert(); 
		System.out.println("Review data lantai :");
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