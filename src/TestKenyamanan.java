
public class TestKenyamanan {
	public static void main(String[] args) {
		
	dataKebisingan bising = new dataKebisingan();
	bising.data();
	bising.AnalysisKebisingan();
	
	dataBau bau = new dataBau();
	bau.data();
	bau.AnalysisBau();
	
	dataKebocoran bocor = new dataKebocoran();
	bocor.data();
	bocor.AnalysisKebocoran();
	
	dataKerusakan rusak = new dataKerusakan();
	rusak.data();
	rusak.AnalysisKerusakan();
	
	
	dataKeausan aus = new dataKeausan();
	aus.data();
	aus.AnalysisKeausan();
}		
}
