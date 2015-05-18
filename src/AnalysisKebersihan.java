
public class AnalysisKebersihan extends Kebersihan{
	public void data(){
		Insert("== Status Data =="); 
		Print("== Review Data ==");
	}
	@Override
	String AnalysisSirkulasiUdara() {
		if(SirkulasiUdara.equals("lancar")){
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}

	@Override
	String AnalysisNilaiPencahayaan() {
		if(NilaiPencahayaan<=350 && NilaiPencahayaan>=250){  
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
}
	

	@Override
	String AnalysisKelembapan() {
		if(Kelembapan<=80 && Kelembapan>=70){   
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}

	@Override
	String AnalysisSuhu() {
		if(Suhu<=35 && Suhu>=25){
	         
			return "Sudah Sesuai Standard ";
	      }
		  else {
	        
	          return "Belum Sesuai Standard";
	      }
	}
	
	@Override
	public void Insert(String kebersihan){
		
		System.out.println("masukkan sirkulasi udara : ");
		SirkulasiUdara = scan.next();
		System.out.println("masukkan nilai pencahayaan : ");
		NilaiPencahayaan = scan.nextInt();
		System.out.println("masukkan nilai kelembapan : ");
		Kelembapan = scan.nextInt();
		System.out.println("masukkan nilai suhu : ");
		Suhu = scan.nextInt();
	}
	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}

}
