
public class dataJendela extends Lingkungan{
	public void data(){
		System.out.println("== Status Data Jendela ==");
		Insert(); 
		System.out.println("== Review Data Jendela ==");
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
