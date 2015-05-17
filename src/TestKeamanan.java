
public class TestKeamanan {
	public static void main(String[] args) {
		
		dataKekokohan kokoh = new dataKekokohan();
		kokoh.data();
		kokoh.AnalysisKekokohan();
		
		dataKunciPintu pintu = new dataKunciPintu();
		pintu.data();
		pintu.AnalysisKunciPintu();
		
		dataKunciJendela jendela = new dataKunciJendela();
		jendela.data();
		jendela.AnalysisKunciJendela();
		
		dataBahaya bahaya = new dataBahaya();
		bahaya.data();
		bahaya.AnalysisBahaya();
	}		
}
