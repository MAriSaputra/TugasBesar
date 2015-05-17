
public class dataKabel_LCD extends Sarana { 
	

		public void data(){
			System.out.println("== Status Data Kabel LCD ==");
			Insert(); 
			System.out.println("== Review Data Kabel LCD ==");
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
		@Override
		boolean AnalysisKondisi(){
			if(Kondisi.equals("baik")){
				System.out.println("Sesuai");
				return true;
			}
			
			else{
				System.out.println("Tidak Sesuai");
			}
			return false;
		}
		@Override
		boolean AnalysisPosisi(){
			if(Posisi.equals("di_dekat_dosen")){
				System.out.println("Sesuai");
				return true;
			}
			else{
				System.out.println("Tidak Sesuai");
			}
			return false;
		}

}
