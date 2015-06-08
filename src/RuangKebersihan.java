import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RuangKebersihan extends JFrame {
	KebersihanRuangKelas kebersihan = new KebersihanRuangKelas();
	private JPanel contentPane;
	private JTextField NilaiPencahayaan;
	private JTextField Kelembapan;
	private JTextField Suhu;
	private JTextField SirkulasiUdara;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangKebersihan frame = new RuangKebersihan();
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
	public RuangKebersihan() {
		setTitle("Kebersihan Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSirkulasiUdara = new JLabel("Sirkulasi Udara");
		lblSirkulasiUdara.setBounds(10, 21, 103, 14);
		contentPane.add(lblSirkulasiUdara);
		
		JLabel lblNilaiPencahayaan = new JLabel("Nilai Pencahayaan");
		lblNilaiPencahayaan.setBounds(10, 46, 118, 14);
		contentPane.add(lblNilaiPencahayaan);
		
		JLabel lblKelembapan = new JLabel("Kelembapan");
		lblKelembapan.setBounds(10, 71, 103, 14);
		contentPane.add(lblKelembapan);
		
		JLabel lblSuhu = new JLabel("Suhu");
		lblSuhu.setBounds(10, 96, 93, 14);
		contentPane.add(lblSuhu);
		
		NilaiPencahayaan = new JTextField();
		NilaiPencahayaan.setBounds(123, 43, 46, 20);
		contentPane.add(NilaiPencahayaan);
		NilaiPencahayaan.setColumns(10);
		
		Kelembapan = new JTextField();
		Kelembapan.setBounds(123, 68, 46, 20);
		contentPane.add(Kelembapan);
		Kelembapan.setColumns(10);
		
		Suhu = new JTextField();
		Suhu.setBounds(123, 93, 46, 20);
		contentPane.add(Suhu);
		Suhu.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangKenyamanan().setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(298, 135, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangLingkungan().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(10, 135, 89, 23);
		contentPane.add(btnPrevious);
		
		JLabel label = new JLabel("%");
		label.setBounds(179, 49, 46, 14);
		contentPane.add(label);
		
		JLabel lblCelcius = new JLabel("Celcius");
		lblCelcius.setBounds(179, 96, 46, 14);
		contentPane.add(lblCelcius);
		
		SirkulasiUdara = new JTextField();
		SirkulasiUdara.setColumns(10);
		SirkulasiUdara.setBounds(123, 18, 118, 20);
		contentPane.add(SirkulasiUdara);
		
		JLabel lblNewLabel = new JLabel("Lancar/Tidak Lancar");
		lblNewLabel.setBounds(253, 21, 118, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kebersihan.setSirkulasiUdara(SirkulasiUdara.getText());
				kebersihan.setNilaiPencahayaan(Integer.parseInt(NilaiPencahayaan.getText()));
				kebersihan.setKelembapan(Integer.parseInt(Kelembapan.getText()));
				kebersihan.setSuhu(Integer.parseInt(Suhu.getText()));
				SaveLoad.simpankebersihan(kebersihan);
			}
		});
		btnSave.setBounds(133, 131, 66, 40);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KebersihanRuangKelas kebersihan = SaveLoad.bacakebersihan();
				SirkulasiUdara.setText(kebersihan.getSirkualasiUdara());
				NilaiPencahayaan.setText(" "+kebersihan.getNilaiPencahayaan());
				Kelembapan.setText(" "+kebersihan.getKelembapan());
				Suhu.setText(" "+kebersihan.getSuhu());
				
			}
		});
		btnLoad.setBounds(203, 131, 66, 40);
		contentPane.add(btnLoad);
	}
}
