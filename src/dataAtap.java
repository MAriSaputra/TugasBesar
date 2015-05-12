
public class dataAtap extends Lingkungan {
	public void data(){
		System.out.println("Status data atap :");
		Insert(); 
		System.out.println("Review data atap :");
		Print();
	}
	
	@Override
	  boolean AnalysisAtap(){
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
