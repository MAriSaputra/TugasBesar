
public class dataKabel_LCD extends Sarana { 
	

		public void data(){
			System.out.println("Status data kabel LCD :");
			Insert(); 
			System.out.println("Review data kabel LCD :");
			Print();
		}
		
		@Override
		boolean AnalysisJumlah(){
			if(Jumlah == 1){
				System.out.println("Sesuai");
				return true;
			}
			
			else{
				System.out.println("Tidak Sesuai");
				return false;
			}
		}
		
		String AnalysisKondisi(){
			if(Kondisi.equals("baik")){
				System.out.println("Sesuai");
			}
			
			else{
				System.out.println("Tidak Sesuai");
			}
			return Kondisi;
		}
		
		String AnalysisPosisi(){
			if(Posisi.equals("di dekat dosen")){
				System.out.println("Sesuai");
			}
			
			else{
				System.out.println("Tidak Sesuai");
			}
			return Posisi;
		}

}
