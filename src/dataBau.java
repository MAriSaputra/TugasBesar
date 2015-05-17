
public class dataBau extends Kenyamanan{
	public void data(){
		System.out.println("== Status Data Bau ==");
		Insert(); 
		System.out.println("== Review Data Bau ==");
		Print();
	}
	
	@Override	
	boolean AnalysisBau(){
		if(Bau.equals("tidak bau")){
		   	   System.out.println("Sudah Sesuai Standard ");
		   	   return true;
		      }
			  else {
		          System.out.println("Belum Sesuai Standard");
		          return false;
		      }
	}

}
