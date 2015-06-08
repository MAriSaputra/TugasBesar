import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RuangSarana extends JFrame {
	JumlahKondisidanPosisiSarana sarana = new JumlahKondisidanPosisiSarana();
	private JPanel contentPane;
	private JTextField JumlahStopKontak;
	private JTextField PosisiStopKontak;
	private JTextField JumlahKabelLCD;
	private JTextField PosisiKabelLCD;
	private JTextField JumlahLampu;
	private JTextField PosisiLampu;
	private JTextField JumlahAC;
	private JTextField PosisiAC;
	private JTextField JumlahCCTV;
	private JTextField PosisiCCTV;
	private JTextField KondisiStopKontak;
	private JTextField KondisiKabelLCD;
	private JTextField KondisiLampu;
	private JTextField KondisiAC;
	private JTextField KondisiCCTV;
	private JTextField JumlahKipasAngin;
	private JTextField KondisiKipasAngin;
	private JTextField PosisiKipasAngin;
	private JTextField SSID;
	private JTextField Bandwidth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangSarana frame = new RuangSarana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RuangSarana() {
		setTitle("Sarana Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStopKontak = new JLabel("DATA STOP KONTAK");
		lblStopKontak.setBounds(10, 8, 133, 14);
		contentPane.add(lblStopKontak);
		
		JLabel lblJumlah = new JLabel("Jumlah Stop Kontak");
		lblJumlah.setBounds(10, 36, 118, 14);
		contentPane.add(lblJumlah);
		
		JLabel lblKondisiStopKontak = new JLabel("Kondisi Stop Kontak");
		lblKondisiStopKontak.setBounds(10, 61, 118, 14);
		contentPane.add(lblKondisiStopKontak);
		
		JLabel lblPosisiStopKontak = new JLabel("Posisi Stop Kontak");
		lblPosisiStopKontak.setBounds(10, 88, 118, 14);
		contentPane.add(lblPosisiStopKontak);
		
		JumlahStopKontak = new JTextField();
		JumlahStopKontak.setBounds(159, 33, 42, 20);
		contentPane.add(JumlahStopKontak);
		JumlahStopKontak.setColumns(10);
		
		PosisiStopKontak = new JTextField();
		PosisiStopKontak.setBounds(159, 85, 133, 20);
		contentPane.add(PosisiStopKontak);
		PosisiStopKontak.setColumns(10);
		
		JLabel lblData = new JLabel("DATA KABEL LCD");
		lblData.setBounds(363, 8, 133, 14);
		contentPane.add(lblData);
		
		JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD");
		lblJumlahKabelLcd.setBounds(363, 36, 105, 14);
		contentPane.add(lblJumlahKabelLcd);
		
		JLabel lblKondisiKabelLcd = new JLabel("Kondisi Kabel LCD");
		lblKondisiKabelLcd.setBounds(363, 61, 105, 14);
		contentPane.add(lblKondisiKabelLcd);
		
		JLabel lblPosisiKabelLcd = new JLabel("Posisi Kabel LCD");
		lblPosisiKabelLcd.setBounds(363, 88, 105, 14);
		contentPane.add(lblPosisiKabelLcd);
		
		JumlahKabelLCD = new JTextField();
		JumlahKabelLCD.setBounds(478, 33, 42, 20);
		contentPane.add(JumlahKabelLCD);
		JumlahKabelLCD.setColumns(10);
		
		PosisiKabelLCD = new JTextField();
		PosisiKabelLCD.setBounds(478, 85, 133, 20);
		contentPane.add(PosisiKabelLCD);
		PosisiKabelLCD.setColumns(10);
		
		JLabel lblDataLampu = new JLabel("DATA LAMPU");
		lblDataLampu.setBounds(10, 113, 76, 14);
		contentPane.add(lblDataLampu);
		
		JLabel lblJumlahLampu = new JLabel("Jumlah Lampu");
		lblJumlahLampu.setBounds(10, 138, 86, 14);
		contentPane.add(lblJumlahLampu);
		
		JLabel lblKondisiLampu = new JLabel("Kondisi Lampu");
		lblKondisiLampu.setBounds(10, 163, 86, 14);
		contentPane.add(lblKondisiLampu);
		
		JLabel lblPosisiLampu = new JLabel("Posisi Lampu");
		lblPosisiLampu.setBounds(10, 188, 86, 14);
		contentPane.add(lblPosisiLampu);
		
		JumlahLampu = new JTextField();
		JumlahLampu.setBounds(159, 135, 42, 20);
		contentPane.add(JumlahLampu);
		JumlahLampu.setColumns(10);
		
		PosisiLampu = new JTextField();
		PosisiLampu.setBounds(159, 185, 133, 20);
		contentPane.add(PosisiLampu);
		PosisiLampu.setColumns(10);
		
		JLabel lblData_1 = new JLabel("DATA AC");
		lblData_1.setBounds(363, 113, 71, 15);
		contentPane.add(lblData_1);
		
		JLabel lblJumlahAc = new JLabel("Jumlah AC");
		lblJumlahAc.setBounds(363, 138, 76, 15);
		contentPane.add(lblJumlahAc);
		
		JLabel lblKondisiAc = new JLabel("Kondisi AC");
		lblKondisiAc.setBounds(363, 163, 86, 14);
		contentPane.add(lblKondisiAc);
		
		JLabel lblPosisiAc = new JLabel("Posisi AC");
		lblPosisiAc.setBounds(363, 188, 86, 14);
		contentPane.add(lblPosisiAc);
		
		JumlahAC = new JTextField();
		JumlahAC.setBounds(478, 135, 42, 20);
		contentPane.add(JumlahAC);
		JumlahAC.setColumns(10);
		
		PosisiAC = new JTextField();
		PosisiAC.setBounds(478, 188, 133, 20);
		contentPane.add(PosisiAC);
		PosisiAC.setColumns(10);
		
		JLabel lblPilihSsid = new JLabel("DATA CCTV");
		lblPilihSsid.setBounds(10, 213, 105, 14);
		contentPane.add(lblPilihSsid);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV");
		lblJumlahCctv.setBounds(10, 238, 86, 14);
		contentPane.add(lblJumlahCctv);
		
		JLabel lblKondisiCctv = new JLabel("Kondisi CCTV");
		lblKondisiCctv.setBounds(10, 263, 86, 20);
		contentPane.add(lblKondisiCctv);
		
		JLabel lblPosisiCctv = new JLabel("Posisi CCTV");
		lblPosisiCctv.setBounds(10, 294, 86, 14);
		contentPane.add(lblPosisiCctv);
		
		JumlahCCTV = new JTextField();
		JumlahCCTV.setBounds(159, 235, 42, 20);
		contentPane.add(JumlahCCTV);
		JumlahCCTV.setColumns(10);
		
		PosisiCCTV = new JTextField();
		PosisiCCTV.setBounds(159, 291, 139, 20);
		contentPane.add(PosisiCCTV);
		PosisiCCTV.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangLingkungan().setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(507, 466, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangKondisi().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(60, 466, 89, 23);
		contentPane.add(btnPrevious);
		
		KondisiStopKontak = new JTextField();
		KondisiStopKontak.setBounds(159, 58, 86, 20);
		contentPane.add(KondisiStopKontak);
		KondisiStopKontak.setColumns(10);
		
		KondisiKabelLCD = new JTextField();
		KondisiKabelLCD.setColumns(10);
		KondisiKabelLCD.setBounds(478, 61, 86, 20);
		contentPane.add(KondisiKabelLCD);
		
		KondisiLampu = new JTextField();
		KondisiLampu.setColumns(10);
		KondisiLampu.setBounds(159, 163, 86, 20);
		contentPane.add(KondisiLampu);
		
		KondisiAC = new JTextField();
		KondisiAC.setColumns(10);
		KondisiAC.setBounds(478, 163, 86, 20);
		contentPane.add(KondisiAC);
		
		KondisiCCTV = new JTextField();
		KondisiCCTV.setColumns(10);
		KondisiCCTV.setBounds(159, 263, 86, 20);
		contentPane.add(KondisiCCTV);
		
		JLabel lblBaikrusak = new JLabel("Baik/Rusak");
		lblBaikrusak.setBounds(574, 64, 71, 14);
		contentPane.add(lblBaikrusak);
		
		JLabel label = new JLabel("Baik/Rusak");
		label.setBounds(255, 163, 71, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Baik/Rusak");
		label_1.setBounds(574, 163, 71, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Baik/Rusak");
		label_2.setBounds(255, 266, 71, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Baik/Rusak");
		label_3.setBounds(249, 61, 71, 14);
		contentPane.add(label_3);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sarana.setJumlahStopKontak(Integer.parseInt(JumlahStopKontak.getText()));
				sarana.setJumlahKabel_LCD(Integer.parseInt(JumlahKabelLCD.getText()));
				sarana.setJumlah_AC(Integer.parseInt(JumlahAC.getText()));
				sarana.setJumlahKipasAngin(Integer.parseInt(JumlahKipasAngin.getText()));
				sarana.setJumlahLampu(Integer.parseInt(JumlahLampu.getText()));
				sarana.setJumlah_CCTV(Integer.parseInt(JumlahCCTV.getText()));
				sarana.setKondisi_AC(KondisiAC.getText());
				sarana.setKondisi_CCTV(KondisiCCTV.getText());
				sarana.setKondisiKabel_LCD(KondisiKabelLCD.getText());
				sarana.setKondisiKipasAngin(KondisiKipasAngin.getText());
				sarana.setKondisiLampu(KondisiLampu.getText());
				sarana.setKondisiStopKontak(KondisiStopKontak.getText());
				sarana.setPosisi_AC(PosisiAC.getText());
				sarana.setPosisi_CCTV(PosisiCCTV.getText());
				sarana.setPosisiKabel_LCD(PosisiKabelLCD.getText());
				sarana.setPosisiKipasAngin(PosisiKipasAngin.getText());
				sarana.setPosisiLampu(PosisiLampu.getText());
				sarana.setPosisiStopKontak(PosisiStopKontak.getText());
				sarana.setBandwidth(Integer.parseInt(Bandwidth.getText()));
				sarana.setSSID(SSID.getText());
				SaveLoad.simpansarana(sarana);
				
			}
		});
		btnSave.setBounds(215, 461, 105, 32);
		contentPane.add(btnSave);
		
		JLabel lblDataKipasAngin = new JLabel("DATA KIPAS ANGIN");
		lblDataKipasAngin.setBounds(363, 213, 125, 14);
		contentPane.add(lblDataKipasAngin);
		
		JLabel lblJumlahKipasAngin = new JLabel("Jumlah Kipas Angin");
		lblJumlahKipasAngin.setBounds(363, 238, 118, 14);
		contentPane.add(lblJumlahKipasAngin);
		
		JLabel lblKondisiKipasAngin = new JLabel("Kondisi Kipas Angin");
		lblKondisiKipasAngin.setBounds(363, 266, 118, 14);
		contentPane.add(lblKondisiKipasAngin);
		
		JLabel lblPosisiKipasAngin = new JLabel("Posisi Kipas Angin");
		lblPosisiKipasAngin.setBounds(363, 294, 105, 14);
		contentPane.add(lblPosisiKipasAngin);
		
		JumlahKipasAngin = new JTextField();
		JumlahKipasAngin.setColumns(10);
		JumlahKipasAngin.setBounds(478, 235, 42, 20);
		contentPane.add(JumlahKipasAngin);
		
		KondisiKipasAngin = new JTextField();
		KondisiKipasAngin.setColumns(10);
		KondisiKipasAngin.setBounds(478, 263, 86, 20);
		contentPane.add(KondisiKipasAngin);
		
		PosisiKipasAngin = new JTextField();
		PosisiKipasAngin.setColumns(10);
		PosisiKipasAngin.setBounds(478, 291, 139, 20);
		contentPane.add(PosisiKipasAngin);
		
		JLabel label_4 = new JLabel("Baik/Rusak");
		label_4.setBounds(574, 266, 71, 14);
		contentPane.add(label_4);
		
		JLabel lblDataInternet = new JLabel("DATA INTERNET");
		lblDataInternet.setBounds(269, 327, 112, 14);
		contentPane.add(lblDataInternet);
		
		JLabel lblSsid = new JLabel("SSID");
		lblSsid.setBounds(139, 355, 64, 14);
		contentPane.add(lblSsid);
		
		SSID = new JTextField();
		SSID.setBounds(213, 352, 184, 20);
		contentPane.add(SSID);
		SSID.setColumns(10);
		
		JLabel lblHotspotUmmlainnya = new JLabel("Hotspot UMM/Lainnya");
		lblHotspotUmmlainnya.setBounds(422, 354, 142, 14);
		contentPane.add(lblHotspotUmmlainnya);
		
		JLabel lblBandwidth = new JLabel("Bandwidth");
		lblBandwidth.setBounds(139, 391, 88, 14);
		contentPane.add(lblBandwidth);
		
		Bandwidth = new JTextField();
		Bandwidth.setColumns(10);
		Bandwidth.setBounds(213, 383, 184, 20);
		contentPane.add(Bandwidth);
		
		JLabel lblNoBandwithHotspot = new JLabel("No. Bandwith Hotspot UMM/Lainnya");
		lblNoBandwithHotspot.setBounds(422, 391, 223, 14);
		contentPane.add(lblNoBandwithHotspot);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JumlahKondisidanPosisiSarana sarana = SaveLoad.bacasarana();
				JumlahStopKontak.setText(" "+sarana.getJumlahStopKontak());
				JumlahKabelLCD.setText(" "+sarana.getJumlahKabel_LCD());
				JumlahLampu.setText(" "+sarana.getJumlahLampu());
				JumlahAC.setText(" "+sarana.getJumlah_AC());
				JumlahCCTV.setText(" "+sarana.getJumlah_CCTV());				
				JumlahKipasAngin.setText(" "+sarana.getJumlahKipasAngin());
				Bandwidth.setText(" "+sarana.getBandwidth());
				SSID.setText(sarana.getSSID());
				KondisiStopKontak.setText(sarana.getKondisiStopKontak());
				KondisiLampu.setText(sarana.getKondisiLampu());
				KondisiKipasAngin.setText(sarana.getKondisiKipasAngin());
				KondisiKabelLCD.setText(sarana.getKondisiKabel_LCD());
				KondisiCCTV.setText(sarana.getKondisi_CCTV());
				KondisiAC.setText(sarana.getKondisi_AC());
				PosisiStopKontak.setText(sarana.getPosisiStopKontak());
				PosisiLampu.setText(sarana.getPosisiLampu());
				PosisiKipasAngin.setText(sarana.getPosisiKipasAngin());
				PosisiKabelLCD.setText(sarana.getPosisiKabel_LCD());
				PosisiCCTV.setText(sarana.getKondisi_CCTV());
				PosisiAC.setText(sarana.getKondisi_AC());
			
			}
		});
		btnLoad.setBounds(330, 461, 105, 32);
		contentPane.add(btnLoad);
	}
}
