
public class dataBahaya extends Keamanan {
	public void data(){
		System.out.println("== Status Data Bahaya ==");
		Insert(); 
		System.out.println("== Review Data Bahaya ==");
		Print();
	}
	
	@Override
	  boolean AnalysisBahaya(){
	  if(KunciJendela.equals("tidak_ada")){
   	   System.out.println("Sudah Sesuai Standard ");
   	   return true;
      }
	  else {
          System.out.println("Belum Sesuai Standard");
          return false;
      }
}
}