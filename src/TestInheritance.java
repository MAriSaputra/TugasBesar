
public class TestInheritance {
	public static void main(String[] args) {
		
		dataStopKontak stopkontak = new dataStopKontak();
		stopkontak.data();
		
		dataKabel_LCD kabelLCD = new dataKabel_LCD();
		kabelLCD.data();
		
		dataKipasAngin kipasangin = new dataKipasAngin();
		kipasangin.data();
		
		dataJendela jendela = new dataJendela();
		jendela.data();
		
		dataLampu lampu = new dataLampu();
		lampu.data();
		
		data_AC ac = new data_AC();
		ac.data();
		
		data_CCTV cctv = new data_CCTV();
		cctv.data();
		
	}
}
