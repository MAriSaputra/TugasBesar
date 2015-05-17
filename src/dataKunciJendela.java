
public class dataKunciJendela extends Keamanan {
	public void data(){
		System.out.println("== Status Data Kunci Jendela ==");
		Insert(); 
		System.out.println("== Review Data Kunci Jendela ==");
		Print();
	}
	
	@Override
	  boolean AnalysisKunciJendela(){
	  if(KunciJendela.equals("sesuai")){
   	   System.out.println("Sudah Sesuai Standard ");
   	   return true;
      }
	  else {
          System.out.println("Belum Sesuai Standard");
          return false;
      }
}
}
