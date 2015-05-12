
public class dataDinding extends Lingkungan {
	public void data(){
		System.out.println("Status data dinding :");
		Insert(); 
		System.out.println("Review data dinding :");
		Print();
	}
	
	@Override
	boolean AnalysisDinding(){
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
