
public class dataJendela extends Lingkungan{
	public void data(){
		System.out.println("Status data jendela :");
		Insert(); 
		System.out.println("Review data jendela :");
		Print();
	}
	
	@Override
	  boolean AnalysisJendela(){
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
