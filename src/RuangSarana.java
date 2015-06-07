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
		setBounds(100, 100, 387, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStopKontak = new JLabel("DATA STOP KONTAK");
		lblStopKontak.setBounds(125, 8, 133, 14);
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
		lblData.setBounds(125, 110, 133, 14);
		contentPane.add(lblData);
		
		JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD");
		lblJumlahKabelLcd.setBounds(10, 138, 105, 14);
		contentPane.add(lblJumlahKabelLcd);
		
		JLabel lblKondisiKabelLcd = new JLabel("Kondisi Kabel LCD");
		lblKondisiKabelLcd.setBounds(10, 163, 105, 14);
		contentPane.add(lblKondisiKabelLcd);
		
		JLabel lblPosisiKabelLcd = new JLabel("Posisi Kabel LCD");
		lblPosisiKabelLcd.setBounds(10, 188, 105, 14);
		contentPane.add(lblPosisiKabelLcd);
		
		JumlahKabelLCD = new JTextField();
		JumlahKabelLCD.setBounds(125, 135, 42, 20);
		contentPane.add(JumlahKabelLCD);
		JumlahKabelLCD.setColumns(10);
		
		PosisiKabelLCD = new JTextField();
		PosisiKabelLCD.setBounds(125, 185, 133, 20);
		contentPane.add(PosisiKabelLCD);
		PosisiKabelLCD.setColumns(10);
		
		JLabel lblDataLampu = new JLabel("DATA LAMPU");
		lblDataLampu.setBounds(125, 210, 76, 14);
		contentPane.add(lblDataLampu);
		
		JLabel lblJumlahLampu = new JLabel("Jumlah Lampu");
		lblJumlahLampu.setBounds(10, 238, 86, 14);
		contentPane.add(lblJumlahLampu);
		
		JLabel lblKondisiLampu = new JLabel("Kondisi Lampu");
		lblKondisiLampu.setBounds(10, 263, 86, 14);
		contentPane.add(lblKondisiLampu);
		
		JLabel lblPosisiLampu = new JLabel("Posisi Lampu");
		lblPosisiLampu.setBounds(10, 288, 86, 14);
		contentPane.add(lblPosisiLampu);
		
		JumlahLampu = new JTextField();
		JumlahLampu.setBounds(125, 235, 42, 20);
		contentPane.add(JumlahLampu);
		JumlahLampu.setColumns(10);
		
		PosisiLampu = new JTextField();
		PosisiLampu.setBounds(125, 285, 133, 20);
		contentPane.add(PosisiLampu);
		PosisiLampu.setColumns(10);
		
		JLabel lblData_1 = new JLabel("DATA AC");
		lblData_1.setBounds(129, 316, 50, 15);
		contentPane.add(lblData_1);
		
		JLabel lblJumlahAc = new JLabel("Jumlah AC");
		lblJumlahAc.setBounds(10, 346, 76, 15);
		contentPane.add(lblJumlahAc);
		
		JLabel lblKondisiAc = new JLabel("Kondisi AC");
		lblKondisiAc.setBounds(10, 369, 86, 14);
		contentPane.add(lblKondisiAc);
		
		JLabel lblPosisiAc = new JLabel("Posisi AC");
		lblPosisiAc.setBounds(10, 394, 86, 14);
		contentPane.add(lblPosisiAc);
		
		JumlahAC = new JTextField();
		JumlahAC.setBounds(125, 343, 42, 20);
		contentPane.add(JumlahAC);
		JumlahAC.setColumns(10);
		
		PosisiAC = new JTextField();
		PosisiAC.setBounds(125, 391, 133, 20);
		contentPane.add(PosisiAC);
		PosisiAC.setColumns(10);
		
		JLabel lblPilihSsid = new JLabel("DATA CCTV");
		lblPilihSsid.setBounds(125, 415, 105, 14);
		contentPane.add(lblPilihSsid);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV");
		lblJumlahCctv.setBounds(10, 446, 86, 14);
		contentPane.add(lblJumlahCctv);
		
		JLabel lblKondisiCctv = new JLabel("Kondisi CCTV");
		lblKondisiCctv.setBounds(10, 467, 86, 20);
		contentPane.add(lblKondisiCctv);
		
		JLabel lblPosisiCctv = new JLabel("Posisi CCTV");
		lblPosisiCctv.setBounds(10, 498, 86, 14);
		contentPane.add(lblPosisiCctv);
		
		JumlahCCTV = new JTextField();
		JumlahCCTV.setBounds(125, 440, 42, 20);
		contentPane.add(JumlahCCTV);
		JumlahCCTV.setColumns(10);
		
		PosisiCCTV = new JTextField();
		PosisiCCTV.setBounds(125, 495, 139, 20);
		contentPane.add(PosisiCCTV);
		PosisiCCTV.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangLingkungan().setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(249, 560, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangKondisi().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(39, 560, 89, 23);
		contentPane.add(btnPrevious);
		
		KondisiStopKontak = new JTextField();
		KondisiStopKontak.setBounds(159, 58, 86, 20);
		contentPane.add(KondisiStopKontak);
		KondisiStopKontak.setColumns(10);
		
		KondisiKabelLCD = new JTextField();
		KondisiKabelLCD.setColumns(10);
		KondisiKabelLCD.setBounds(125, 160, 86, 20);
		contentPane.add(KondisiKabelLCD);
		
		KondisiLampu = new JTextField();
		KondisiLampu.setColumns(10);
		KondisiLampu.setBounds(125, 260, 86, 20);
		contentPane.add(KondisiLampu);
		
		KondisiAC = new JTextField();
		KondisiAC.setColumns(10);
		KondisiAC.setBounds(125, 366, 86, 20);
		contentPane.add(KondisiAC);
		
		KondisiCCTV = new JTextField();
		KondisiCCTV.setColumns(10);
		KondisiCCTV.setBounds(125, 467, 86, 20);
		contentPane.add(KondisiCCTV);
		
		JLabel lblBaikrusak = new JLabel("Baik/Rusak");
		lblBaikrusak.setBounds(221, 163, 71, 14);
		contentPane.add(lblBaikrusak);
		
		JLabel label = new JLabel("Baik/Rusak");
		label.setBounds(221, 263, 71, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Baik/Rusak");
		label_1.setBounds(221, 369, 71, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Baik/Rusak");
		label_2.setBounds(221, 470, 71, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Baik/Rusak");
		label_3.setBounds(249, 61, 71, 14);
		contentPane.add(label_3);
	}
}
